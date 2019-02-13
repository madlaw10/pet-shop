package petshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CashRegisterTest {
	
	CashRegister underTest;
	
	@Before
	public void setup() {
		underTest = new CashRegister();
	}
	
	@Test
	public void shouldAddMoneyToRegister() {
		int billTrayBeforeAddingCash = underTest.getBillTray();
		underTest.addCash(10);
		int billTrayAfterAddingCash = underTest.getBillTray();
		assertEquals(billTrayBeforeAddingCash + 10, billTrayAfterAddingCash);
	}
	
	@Test
	public void shouldRemoveMoneyToRegister() {
		int billTrayBeforeRemovingCash = underTest.getBillTray();
		underTest.removeCash(10);
		int billTrayAfterRemovingCash = underTest.getBillTray();
		assertEquals(billTrayBeforeRemovingCash - 10, billTrayAfterRemovingCash);
	}


}
