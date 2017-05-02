package soundsystem.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
	//声明Bean
	@Bean(name="cd1")
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
}
