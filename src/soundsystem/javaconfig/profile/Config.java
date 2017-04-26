package soundsystem.javaconfig.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//导入其他JavaConfig
@Import({CDConfig.class,CDPlayerConfig.class})
public class Config {

}
