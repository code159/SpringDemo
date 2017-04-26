package soundsystem.auto;

import org.springframework.stereotype.Component;
//CD实现类。使用Component注解，告知Spring要为这个类创建bean
@Component
public class SgtPeppers implements CompactDisc {
	private String title="Sgt Peppers";
	private String artist="the Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing "+this.title+" by"+this.artist+"...");
	}

}
