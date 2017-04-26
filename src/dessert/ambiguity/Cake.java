package dessert.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cake implements Dessert{

	@Override
	public void desc() {
		System.out.println("a cake!");
	}

}
