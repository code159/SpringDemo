package soundsystem.javaconfig.profile;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.javaconfig.CDPlayer;
import soundsystem.javaconfig.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
//@ActiveProfiles("dev")
@ActiveProfiles("prod")
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	//由于已经指定Profile，在本例中不存在二义性，不需要指定bean
	//由于有两个候选bean:cdPlayer1、cdPlayer2，需要用@Resource指定
	//@Resource(name="cdPlayer2")
	@Autowired
	private CDPlayer player;
	
	@Test
	public void play(){
		player.play();
	}
}
