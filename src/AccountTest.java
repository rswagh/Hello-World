import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest {

	@Test
	public void testAccount() {
		fail("Not yet implemented");
		Account act= new Account(100);
		assertEquals(100, act.getBalance());
	}

	

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		Account act= new Account(100);
		int oldBalance =act.getBalance();
		act.deposit(500);
		assertEquals(500+oldBalance, act.getBalance());
		
		
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		Account act= new Account(100);
		act.deposit(500);
		int oldBalance =act.getBalance();
		act.withdraw(400);
		assertEquals(oldBalance-400, act.getBalance());
	}

}
