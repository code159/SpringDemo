package soundsystem.javaconfig;

public class SgtPeppers implements CompactDisc {
	private String title="Sgt Peppers";
	private String artist="the Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing "+this.title+" by "+this.artist+"...");
	}

}
