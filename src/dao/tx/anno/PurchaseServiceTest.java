package dao.tx.anno;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="tx.xml")
public class PurchaseServiceTest {
	@Autowired
	private PurchaseService ps;
	
	@Test
	public void testPurchase() {
		ps.purchase("userId1", "bookId1");
	}

}
