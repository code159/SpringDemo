package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Ice
@Cream
public class IceCream implements Dessert{

	@Override
	public void desc() {
		System.out.println("a icecream!");
	}

}
