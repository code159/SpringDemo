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
		//����IOC����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//����id��λ��IOC������bean
		HelloWorld hello=(HelloWorld)ctx.getBean("HelloWorld"); //getBean���������丸�ӿ�BeanFactory�ж���ģ��ж���������ʽ
		hello.getHello();
		//�������ͷ���IOC�����е�bean����Ҫ��IOC�����б���ֻ����һ�������͵�bean
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
