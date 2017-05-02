package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private Eat eat;
	
	public void action(){
		System.out.print("main:");
		eat.action();
	}
	
	public static void main(String[] args){
		//Main main=new Main();
		//main.action();
		//  main.eat.action();
		
		ApplicationContext beanFactory=new AnnotationConfigApplicationContext(Config.class);
		for(String str:beanFactory.getBeanDefinitionNames()){
			System.out.println(str);
		}
        Eat eat = (Eat)beanFactory.getBean("eat");
        eat.action();
        
        //这个Main不能是自己new出来的，必须是从Spring容器中取出来的。
        Main main = (Main)beanFactory.getBean("main");
        main.action();
	}
}
