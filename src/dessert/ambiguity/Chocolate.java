package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("very sweet")
public class Chocolate implements Dessert{

	@Override
	public void desc() {
		System.out.println("a chocolate!");
	}

}
