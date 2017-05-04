package sleep.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class CalHelper {
    public void beforeCal(JoinPoint joinPoint){
    	String methodName=joinPoint.getSignature().getName();
    	List<Object> args=Arrays.asList(joinPoint.getArgs());
    	System.out.println("前置通知 the method "+methodName+" begins with ["+args+"]");
    }
    
    public void afterCal(JoinPoint joinPoint){
    	String methodName=joinPoint.getSignature().getName();
    	List<Object> args=Arrays.asList(joinPoint.getArgs());
    	System.out.println("后置通知 the method "+methodName+" ends with ["+args+"]");    
    }
    
    public void afterReturingCal(JoinPoint joinPoint,Object result){
    	String methodName=joinPoint.getSignature().getName();
    	Object[] args=joinPoint.getArgs();
    	System.out.println("返回通知 the method "+methodName+" begin with "+Arrays.asList(args));
    	System.out.println("result:"+result);
    }
    
    public void afterThrowingCal(JoinPoint joinPoint,Exception ex){
    	String methodName=joinPoint.getSignature().getName();
    	System.out.println("异常通知 the method "+methodName+" throw exception "+ex);
    }
    
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
