package beans.cycle;

public class Car {
	private String brand;
	
	public Car(){
		System.out.println("构造器初始化Car实例");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("设置Car实例的brand属性");
	}
	
	public void init2(){
		System.out.println("init...");
	}
	public void destroy2(){
		System.out.println("destroy...");
	}
}
