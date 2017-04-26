package soundsystem.javaconfig.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import soundsystem.javaconfig.CDPlayer;
import soundsystem.javaconfig.CompactDisc;

@Configuration
public class CDPlayerConfig {
	//װ��
	//������ע��
	@Bean
	@Profile("dev")
	public CDPlayer cdPlayer(CompactDisc cd){
		System.out.println("dev cdPlayer");
		return new CDPlayer(cd);
	}
	//setterע��
	@Bean
	@Profile("prod")
	public CDPlayer cdPlayer2(CompactDisc cd){
		System.out.println("prod cdPlayer2");
		CDPlayer cdPlayer=new CDPlayer(cd);
		cdPlayer.setCompactDisc(cd);
		return cdPlayer;
	}
	@Bean
	public CDPlayer cdPlayer3(CompactDisc cd){
		System.out.println("no profile cdPlayer3");
		CDPlayer cdPlayer=new CDPlayer(cd);
		cdPlayer.setCompactDisc(cd);
		return cdPlayer;
	}
}
