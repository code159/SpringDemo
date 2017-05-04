package aop.principle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JDK动态代理：依赖接口实现
 * 更加通用，可同时用于多个接口
 * 优点：可以突破静态代理的限制，一个动态代理类为多个接口服务
 * 缺点：无法用于未实现接口的目标类
 * AOP的原理：JDK动态代理和cglib动态代理
 */
public class ArithmeticCalculatorLoggingProxy2 implements InvocationHandler{
	//要代理的对象
	private Object target;
	
	public Object bind(Object target){
		this.target=target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName=method.getName();
		//日志
		System.out.println("The method "+methodName+" begins with "+Arrays.asList(args));
		//目录对象执行方法
		Object result=method.invoke(target, args);
		//日志
		System.out.println("The method "+methodName+" ends with "+Arrays.asList(args));
		return result;
	}
}
