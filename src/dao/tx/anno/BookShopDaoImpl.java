package dao.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookShopDaoImpl implements BookShopDao {
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public Integer findPriceById(String bookId) {
		String sql="select price from book where book_id=?";
		return jt.queryForObject(sql, Integer.class, bookId);
	}

	@Override
	public void updateBookAmount(String bookId) {
		String sql="select amount from book_stock where book_id=?";
		int amount=jt.queryForObject(sql, Integer.class, bookId);
		if(amount-1<0){
			System.out.println("库存不足");
			throw new RuntimeException("库存不足");
		}else{
			sql="update book_stock set amount=amount-1 where book_id=?";
			jt.update(sql, bookId);
		}
	}

	@Override
	public void updateUserBalance(String userId, Integer price) {
		String sql="select balance from user where user_id=?";
		int balance=jt.queryForObject(sql, Integer.class, userId);
		int rest=balance-price;
		if(rest<0){
			System.out.println("余额不足");
			throw new RuntimeException("余额不足");
		}else{
			sql="update user set balance=? where user_id=?";
			jt.update(sql, rest, userId);
		}
	}

}
