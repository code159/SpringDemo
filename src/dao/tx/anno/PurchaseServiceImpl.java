package dao.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
//事务传播级别Propagation：默认是REQUIRED,即如果上下文中已经存在事务，那么就加入到事务中执行，如果当前上下文中不存在事务，则新建事务执行。
//事务隔离级别Isolation，
//异常回滚noRollbackFor/rollbackFor
//只读属性readOnly，指定事务是否只读
//超时属性timeout，指定强制回滚之前事务可占用的时间
@Transactional(propagation=Propagation.REQUIRED,
			isolation=Isolation.READ_COMMITTED,
			rollbackFor=RuntimeException.class,
			readOnly=false,
			timeout=3
			)
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private BookShopDao bsd;

	@Override
	public void purchase(String userId, String bookId) {
		int price=bsd.findPriceById(bookId);
		//更新库存
		bsd.updateBookAmount(bookId);
		//更新客户余额
		bsd.updateUserBalance(userId, price);
	}

}
