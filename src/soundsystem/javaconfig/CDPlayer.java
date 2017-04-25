package soundsystem.javaconfig;

public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
	}
	public void play(){
		this.cd.play();
	}
	public void setCompactDisc(CompactDisc cd){
		this.cd=cd;
	}
}
