package soundsystem.javaconfig.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import soundsystem.javaconfig.CDPlayer;
//�ڷǼ��ɲ������@ActiveProfiles��Ч
//@ActiveProfiles({"dev","prod"})
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
//		CDPlayer cdp=(CDPlayer) ctx.getBean("cdPlayer");
//		cdp.play();
		
//		CDPlayer cdp2=(CDPlayer) ctx.getBean("cdPlayer2");
//		cdp2.play();
		
		//δ����@Profile��bean�Կ�ֱ��ʹ��
		CDPlayer cdp3=(CDPlayer) ctx.getBean("cdPlayer3");
		cdp3.play();
	}

}
