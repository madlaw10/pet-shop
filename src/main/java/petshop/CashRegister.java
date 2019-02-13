package petshop;

public class CashRegister {

	// Properties
	private int billTray;

	// Constructor
	public CashRegister() {
		this.billTray = 100;
	}

	// Getters
	public int getBillTray() {
		return billTray;
	}

	// Actions
	public void addCash(int cash) {
		billTray += cash;
	}

	public void removeCash(int cash) {
		billTray -= cash;		
	}

}
