package aop.principle;

public class Main {
	public static void main(String[] args) {
		ArithmeticCalculator impl=new ArithmeticCalculatorImpl();
		
		//只作为演示，实际用处不大
		ArithmeticCalculator proxy=new ArithmeticCalculatorLoggingProxy(impl).getLoggingProxy();
		System.out.println(proxy.add(3, 2));
		
		//更通用。同一个JDK动态代理类可以为多个接口服务
		ArithmeticCalculator proxy2=(ArithmeticCalculator) new ArithmeticCalculatorLoggingProxy2().bind(impl);
		System.out.println(proxy.div(3, 2));
		
		Library libimpl=new LibraryImpl();
		Library proxy3=(Library) new ArithmeticCalculatorLoggingProxy2().bind(libimpl);
		System.out.println(proxy3.addBook("good book!"));
		System.out.println(proxy3.subBook("good book!"));
		
		//CgLib
		LibraryNoImpl libnoimpl=new LibraryNoImpl();
		LibraryNoImpl proxy4=(LibraryNoImpl) new LibraryCglib().getInstance(libnoimpl);
		proxy4.add();
	}
}
