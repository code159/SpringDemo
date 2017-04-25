package soundsystem.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		CDPlayer cdp=(CDPlayer) ctx.getBean("cdPlayer");
		cdp.play();
		
		CDPlayer cdp2=(CDPlayer) ctx.getBean("cdPlayer2");
		cdp2.play();
	}

}
