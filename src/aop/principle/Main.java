package aop.principle;

public class Main {
	public static void main(String[] args) {
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(new ArithmeticCalculatorImpl()).getLoggingProxy();
		System.out.println(proxy.add(3, 2));
	}
}
