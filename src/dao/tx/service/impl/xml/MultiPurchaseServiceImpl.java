package dao.tx.service.impl.xml;

import java.util.List;

import dao.tx.service.xml.MultiPurchaseService;
import dao.tx.service.xml.PurchaseService;

public class MultiPurchaseServiceImpl implements MultiPurchaseService {
	private PurchaseService ps;
	
	public void setPs(PurchaseService ps) {
		this.ps = ps;
	}

	@Override
	public void multiPurchase(String userId, List<String> bookId) {
		for(String id:bookId){
			ps.purchase(userId, id);
		}
	}

}
