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
	
	//�����Ѿ�ָ��Profile���ڱ����в����ڶ����ԣ�����Ҫָ��bean
	//������������ѡbean:cdPlayer1��cdPlayer2����Ҫ��@Resourceָ��
	//@Resource(name="cdPlayer2")
	@Autowired
	private CDPlayer player;
	
	@Test
	public void play(){
		player.play();
	}
}
