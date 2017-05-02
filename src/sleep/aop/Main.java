package sleep.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("sleep/aop/aopSleep.xml");
		Sleepable sleeper=(Sleepable)ctx.getBean("humanProxy");
		sleeper.sleep();
		
		ctx=new ClassPathXmlApplicationContext("sleep/aop/autoProxyAopSleep.xml");
		sleeper=(Sleepable)ctx.getBean("human");
		sleeper.sleep();
		
		ctx=new ClassPathXmlApplicationContext("sleep/aop/annotationAopSleep.xml");
		sleeper=(Sleepable)ctx.getBean("human");
		sleeper.sleep();
	}

}
