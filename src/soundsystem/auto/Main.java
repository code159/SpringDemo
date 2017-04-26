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
        
        //���Main�������Լ�new�����ģ������Ǵ�Spring������ȡ�����ġ�
        Main main = (Main)beanFactory.getBean("main");
        main.cdp.play();;
	}
}
