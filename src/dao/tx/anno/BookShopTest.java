package dao.tx.anno;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="tx.xml")
public class BookShopTest {
	@Autowired
	private BookShopDao bsd;

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

}