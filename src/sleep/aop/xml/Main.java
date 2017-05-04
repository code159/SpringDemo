package sleep.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.principle.ArithmeticCalculator;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("sleep/aop/xml/aopSleep.xml");
		Sleepable sleeper=(Sleepable)ctx.getBean("humanProxy");
		sleeper.sleep();
		
		ctx=new ClassPathXmlApplicationContext("sleep/aop/xml/autoProxyAopSleep.xml");
		sleeper=(Sleepable)ctx.getBean("human");
		sleeper.sleep();
		
		//推荐的aop xml用法
		ctx=new ClassPathXmlApplicationContext("sleep/aop/xml/aopCal.xml");
		ArithmeticCalculator ac=(ArithmeticCalculator) ctx.getBean("calc");
		System.out.println(ac.add(3, 5));
		System.out.println(ac.div(10, 0));
		
		ctx.close();
	}
}
