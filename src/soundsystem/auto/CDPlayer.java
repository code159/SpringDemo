package soundsystem.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
//	自动装配，可以用在类的任何方法上
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
	}
	public void play(){
		this.cd.play();
	}
}
