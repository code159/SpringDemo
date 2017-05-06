package dao.tx.anno;

public interface BookShopDao {
	//获取书的单价
	Integer findPriceById(String id);
	
	//更新书的库存：amount-1
	void updateBookAmount(String id);
	
	//更新用户的帐户余额：user的balance-price
	void updateUserBalance(String userId,Integer price);
}
