package petshop;

public class PetSupplies {

	// Properties
	private int food;
	private int litter;
	private int bedding;

	// Constructor
	public PetSupplies() {
		this.food = 100;
		this.litter = 100;
		this.bedding = 100;
	}

	// Getters
	public int getFoodSupply() {
		return food;
	}

	public int getLitterSupply() {
		return litter;
	}

	public int getBeddingSupply() {
		return bedding;
	}

	// Methods
	public void usePetFood() {
		food -= 10;
	}

	public void restockPetFood() {
		food += 10;
	}

	public void useCatLitter() {
		litter -= 10;
	}

	public void restockCatLitter() {
		litter += 10;
	}

	public void useBedding() {
		bedding -= 10;
	}

	public void restockBedding() {
		bedding += 10;
	}

}
