package soundsystem.auto;

import org.springframework.stereotype.Component;
//CDʵ���ࡣʹ��Componentע�⣬��֪SpringҪΪ����ഴ��bean
@Component
public class SgtPeppers implements CompactDisc {
	private String title="Sgt Peppers";
	private String artist="the Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing "+this.title+" by"+this.artist+"...");
	}

}
