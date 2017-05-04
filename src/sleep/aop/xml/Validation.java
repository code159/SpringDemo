package sleep.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class Validation {
	public void beforeCal(){
		System.out.println("-->driven by ValidationAspect");
	}
}
