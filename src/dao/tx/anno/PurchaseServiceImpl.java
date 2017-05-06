package dao.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
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
