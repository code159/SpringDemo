package soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	//װ��
	//������ע��
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
	//setterע��
	@Bean
	public CDPlayer cdPlayer2(CompactDisc cd){
		CDPlayer cdPlayer=new CDPlayer(cd);
		cdPlayer.setCompactDisc(cd);
		return cdPlayer;
	}
}
