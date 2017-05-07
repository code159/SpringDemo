package dao.tx.service.impl.xml;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.tx.service.xml.BookShopDao;
import dao.tx.service.xml.MultiPurchaseService;
import dao.tx.service.xml.PurchaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="tx.xml")
public class BookShopTest {
	@Autowired
	private BookShopDao bsd;
	
	@Autowired
	private PurchaseService ps;
	
	@Autowired
	private MultiPurchaseService mps;
	

	@Test
	public void testFindPriceById() {
		System.out.println(bsd.findPriceById("bookId1"));
	}

	@Test
	public void testUpdateBookAmount() {
		bsd.updateBookAmount("bookId1");
	}

	@Test
	public void testUpdateUserBalance() {
		bsd.updateUserBalance("userId1", 1);
	}
	
	@Test
	public void testPurchase() {
		ps.purchase("userId1", "bookId1");
	}
	
	@Test
	public void testMultiPurchase(){
		mps.multiPurchase("userId1", Arrays.asList("bookId1","bookId2"));
	}

}
