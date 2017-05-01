package beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans/cycle/beans-cycle.xml");
		Car car=(Car) ctx.getBean("car");
		System.out.println("car的实例对象为"+car+" brand属性为："+car.getBrand());
		ctx.close();
	}

}
