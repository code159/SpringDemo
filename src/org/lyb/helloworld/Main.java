package org.lyb.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		/*传统写法
		//创建对象
		HelloWorld hello=new HelloWorld();
		//为属性赋值
		hello.setName("liyubin");*/
		
//		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld hello=(HelloWorld)factory.getBean("HelloWorld");
		//创建IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//利用id定位到IOC容器的bean
		HelloWorld hello=(HelloWorld)ctx.getBean("HelloWorld"); //getBean方法是在其父接口BeanFactory中定义的，有多种重载形式
		hello.getHello();
		//利用类型返回IOC容器中的bean，但要求IOC容器中必须只能有一个该类型的bean
		HelloWorld hello2=ctx.getBean(HelloWorld.class);
		System.out.println(hello2);
		hello2.getHello();
		
		Car car=(Car)ctx.getBean("car");
		System.out.println(car);
		Car car2=(Car)ctx.getBean("car2");
		System.out.println(car2);
		
		Person person=ctx.getBean(org.lyb.helloworld.Person.class);
		System.out.println(person);
	}
}
