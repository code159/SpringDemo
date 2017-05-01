package beans.factory;

import java.util.HashMap;

/**
 * 静态工厂方法
 */
public class StaticCarFactory {
	static private HashMap<String,Car> carMap=new HashMap<>();
	
	static{
		carMap.put("audi",new Car("Audi",300000.5));
		carMap.put("rover",new Car("Rover",400000.9));
	}
	
	public static Car getCar(String name){
		return carMap.get(name);
	}
}
