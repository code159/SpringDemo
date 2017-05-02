package beans.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans/factory/beans-factory.xml");
		Car car1=(Car) ctx.getBean("staticCar");
		System.out.println(car1);
		
		Car car2=(Car) ctx.getBean("instanceCar");
		System.out.println(car2);
		
		ctx.close();
	}

}
