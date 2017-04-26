package dessert.ambiguity;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Dessert{

	@Override
	public void desc() {
		System.out.println("a icecream!");
	}

}
