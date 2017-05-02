package soundsystem.javaconfig.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import soundsystem.javaconfig.CompactDisc;
import soundsystem.javaconfig.SgtPeppers;

@Configuration
public class CDConfig {
	//声明Bean
	@Bean(name="cd1")
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
}
