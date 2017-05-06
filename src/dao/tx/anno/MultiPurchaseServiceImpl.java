package dao.tx.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation=Propagation.REQUIRED)
//事务传播级别：默认是REQUIRED,即如果上下文中已经存在事务，那么就加入到事务中执行，如果当前上下文中不存在事务，则新建事务执行。
public class MultiPurchaseServiceImpl implements MultiPurchaseService {
	@Autowired
	private PurchaseService ps;

	@Override
	public void multiPurchase(String userId, List<String> bookId) {
		for(String id:bookId){
			ps.purchase(userId, id);
		}
	}

}
