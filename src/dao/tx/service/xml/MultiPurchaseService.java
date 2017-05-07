package dao.tx.service.xml;

import java.util.List;

public interface MultiPurchaseService {
	void multiPurchase(String userId,List<String> bookId);
}
