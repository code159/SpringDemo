package dao.tx.anno;

import java.util.List;

public interface MultiPurchaseService {
	void multiPurchase(String userId,List<String> bookId);
}
