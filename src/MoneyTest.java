import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
	Money myMoney;

	@Before
	public void setUp() throws Exception {
		myMoney = new Money(100, "Rs");
		
	}

	@Test
	public void testMoney() {
		//fail("Not yet implemented");
		assertNotNull(myMoney);
		assertEquals(100, myMoney.getValue());
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		Money yourMoney= myMoney.multiply();
		assertEquals(myMoney.getValue(), yourMoney.getValue());
	}


}
