package org.lyb.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		/*��ͳд��
		//��������
		HelloWorld hello=new HelloWorld();
		//Ϊ���Ը�ֵ
		hello.setName("liyubin");*/
		
//		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld hello=(HelloWorld)factory.getBean("HelloWorld");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hello=(HelloWorld)ctx.getBean("HelloWorld");
				
		hello.getHello();
	}
}
