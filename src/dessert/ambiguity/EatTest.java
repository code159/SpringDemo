package dessert.ambiguity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class EatTest {
	@Autowired
	@Ice
	@Sugar
	private Dessert dessert;
	
	@Test
	public void notNull(){
		assertNotNull(dessert);
	}
	
	@Test
	public void getDesc(){
		dessert.desc();
	}
	
	
	@Autowired
	private Eat eat;
	
	
	@Test
	public void action(){
		eat.action();
	}
}
