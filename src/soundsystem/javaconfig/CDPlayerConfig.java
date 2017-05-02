package soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	//装配
	//构造器注入
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
	//setter注入
	@Bean
	public CDPlayer cdPlayer2(CompactDisc cd){
		CDPlayer cdPlayer=new CDPlayer(cd);
		cdPlayer.setCompactDisc(cd);
		return cdPlayer;
	}
}
