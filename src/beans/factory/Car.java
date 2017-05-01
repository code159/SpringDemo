package beans.factory;

public class Car {
	private String brand;
	private double price;
	
	public Car(String brand,double price){
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
}
