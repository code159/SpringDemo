package sleep.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aopSleep.xml");
		Sleepable sleeper=(Sleepable)ctx.getBean("humanProxy");
		sleeper.sleep();
		
		ctx=new ClassPathXmlApplicationContext("autoProxyAopSleep.xml");
		sleeper=(Sleepable)ctx.getBean("human");
		sleeper.sleep();
	}

}
