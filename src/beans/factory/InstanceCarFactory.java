package beans.factory;

import java.util.HashMap;

/**
 * 静态工厂方法
 */
public class InstanceCarFactory {
	private HashMap<String,Car> carMap=new HashMap<>();
	
	public InstanceCarFactory(){
		carMap.put("ford",new Car("Ford",500000.5));
		carMap.put("benz",new Car("Benz",400000.9));
	}
	
	public Car getCar(String name){
		return carMap.get(name);
	}
}
