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
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hello=(HelloWorld)ctx.getBean("HelloWorld");
				
		hello.getHello();
	}
}
