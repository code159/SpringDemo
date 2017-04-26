package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eat {
	private Dessert dessert;
	
	@Autowired
	public Eat(Dessert d){
		this.dessert=d;
	}
	
	public void action(){
		System.out.print("i eat ");
		this.dessert.desc();
	}
}
