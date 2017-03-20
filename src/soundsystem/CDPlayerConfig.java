package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//默认不开启组件扫描
//使用注解方式开启自动扫描。如果没有其他配置的话， @ComponentScan默认会扫描与配置类相同的包
@Configuration
@ComponentScan
public class CDPlayerConfig {

}
