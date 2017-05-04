package sleep.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class Human implements Sleepable{

	@Override
	public void sleep() {
		System.out.println("睡觉中。。。");
	}

}
