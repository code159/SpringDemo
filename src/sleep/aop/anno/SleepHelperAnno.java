package sleep.aop.anno;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class SleepHelperAnno {

    public SleepHelperAnno(){
        
    }
    
    @Pointcut("execution(* *.sleep())")
    public void sleeppoint(){}
    
    //前置通知
    @Before("sleeppoint()")
    public void beforeSleep(JoinPoint joinPoint){
    	String methodName=joinPoint.getSignature().getName();
    	List<Object> args=Arrays.asList(joinPoint.getArgs());
    	System.out.println("the method "+methodName+" begins with ["+args+"]");
        System.out.println("睡觉前要脱衣服!");
    }
    
    //后置通知
    @After("sleeppoint()")
    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }
    
    @Pointcut("execution(* aop.principle.ArithmeticCalculator.*(..))")
    public void cal(){}
    
    //返回通知，可以访问目标对象的返回值
    @AfterReturning(value="cal()",returning="result")
    public void afterReturingCal(JoinPoint joinPoint,Object result){
    	String methodName=joinPoint.getSignature().getName();
    	Object[] args=joinPoint.getArgs();
    	System.out.println("返回通知 the method "+methodName+" begin with "+Arrays.asList(args));
    	System.out.println("result:"+result);
    }
    
    //异常通知，可以在出现特定异常时通知
    @AfterThrowing(value="cal()",throwing="ex")
    public void afterThrowingCal(JoinPoint joinPoint,Exception ex){
    	String methodName=joinPoint.getSignature().getName();
    	System.out.println("异常通知 the method "+methodName+" throw exception "+ex);
    }
    
    //环绕通知，类似于动态代理的全过程，ProceedingJoinPoint参数可以决定是否执行目标方法。且环绕通知必须要有返回值，即目标方法的返回值
    @Around("cal()")
    public Object aroundMethod(ProceedingJoinPoint pjd){
    	//未执行目标方法
//    	System.out.println("aroundMethod");
//    	return 100;
    	
    	//执行目标方法
    	Object result=null;
    	String methodName=pjd.getSignature().getName();
    	Object[] args=pjd.getArgs();
    	try {
    		//前置通知
        	System.out.println("the method "+methodName+" begins with "+Arrays.asList(args));        	
        	//执行目标方法
			result=pjd.proceed(args);
			//后置通知
        	System.out.println("the method "+methodName+" ends with "+Arrays.asList(args));
		} catch (Throwable e) {
			//异常通知	
			System.out.println("the method "+methodName+" throw exception");
		}
    	
    	return result;
    }
}