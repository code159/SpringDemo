package beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//Bean后置处理器
public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	//init-method后的方法
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization:"+arg0+","+arg1);
		return arg0;
	}

	@Override
	//init-method前的方法
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		if(arg0 instanceof Car){
			Car c=(Car)arg0;
			if(c.getBrand().equals("Audi")){
				System.out.println("postProcessBeforeInitialization:"+arg0+","+arg1);
			}
		}
	
		Car car=new Car();
		car.setBrand("Benz");
		return car;
	}

}
