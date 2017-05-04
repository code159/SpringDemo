package sleep.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class ValidationAspect {
	//可直接引用另一个类中定义的切点
	@Before("SleepHelperAnno.cal()")
	public void beforeCal(){
		System.out.println("-->driven by ValidationAspect");
	}
}
