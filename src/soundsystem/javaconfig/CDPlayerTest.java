package soundsystem.javaconfig;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
	
	//由于有两个候选bean:cdPlayer1、cdPlayer2，需要用@Resource指定
	@Resource(name="cdPlayer2")
	private CDPlayer player;
	
	@Test
	public void play(){
		player.play();
	}
}
