package soundsystem.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
//	�Զ�װ�䣬������������κη�����
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
	}
	public void play(){
		this.cd.play();
	}
}
