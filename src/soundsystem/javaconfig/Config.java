package soundsystem.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//��������JavaConfig
@Import({CDConfig.class,CDPlayerConfig.class})
public class Config {

}
