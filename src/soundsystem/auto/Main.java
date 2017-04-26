package soundsystem.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private CDPlayer cdp;
	
	public static void main(String[] args){
			
		ApplicationContext beanFactory=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		for(String str:beanFactory.getBeanDefinitionNames()){
			System.out.println(str);
		}
        CDPlayer CDPlayer = (CDPlayer)beanFactory.getBean("CDPlayer");
        CDPlayer.play();
        
        //这个Main不能是自己new出来的，必须是从Spring容器中取出来的。
        Main main = (Main)beanFactory.getBean("main");
        main.cdp.play();;
	}
}
