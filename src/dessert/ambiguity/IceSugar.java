package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Java不允许同一位置出现相同的注解
//@Qualifier("ice")
//@Qualifier("sugar")
//使用自定义限定注解，解决面向特性的限定名歧义问题
@Ice
@Sugar
public class IceSugar implements Dessert{
	@Override
	public void desc() {
		System.out.println("a icesugar!");
	}
}
