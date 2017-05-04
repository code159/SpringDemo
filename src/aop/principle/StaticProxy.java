package aop.principle;

//静态代理，在运行前代理类的class文件已经存在
//缺点是每个代理类只能代理一个接口，这样会产生过多的代理，且所有的代理操作除了调用的目标（委托）对象方法不一样外，其他都一样，重复代码。
public class StaticProxy {

	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		CountProxy countProxy = new CountProxy(countImpl);
		countProxy.updateCount();
		countProxy.queryCount();
	}

}

// 定义一个账户接口
interface Count {
	// 查看账户方法
	public void queryCount();

	// 修改账户方法
	public void updateCount();
}

/**
 * 委托类(包含业务逻辑)
 * 
 */
class CountImpl implements Count {

	@Override
	public void queryCount() {
		System.out.println("查看账户方法...");

	}

	@Override
	public void updateCount() {
		System.out.println("修改账户方法...");

	}

}

/**
 * 这是一个代理类（增强CountImpl实现类）
 * 
 */
class CountProxy implements Count {
	private CountImpl countImpl;

	/**
	 * 覆盖默认构造器
	 * 
	 */
	public CountProxy(CountImpl countImpl) {
		this.countImpl = countImpl;
	}

	@Override
	public void queryCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		countImpl.queryCount();
		System.out.println("事务处理之后");
	}

	@Override
	public void updateCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		countImpl.updateCount();
		System.out.println("事务处理之后");

	}
}
