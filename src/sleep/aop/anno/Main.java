package sleep.aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.principle.ArithmeticCalculator;
import sleep.aop.xml.Sleepable;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("sleep/aop/anno/annotationAopSleep.xml");
		Sleepable sleeper=(Sleepable)ctx.getBean("human");
		sleeper.sleep();
		
		ArithmeticCalculator ac=(ArithmeticCalculator) ctx.getBean("calc");
		ac.div(10, 5);
		ac.div(10, 0);
	}

}
