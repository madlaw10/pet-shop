package petshop;

public abstract class Pet {

	private String name;
	private int boredom;
	private int hunger;
	private int bladder;
	private int dirt;

	public Pet(String name) {
		this.name = name;
		this.boredom = 10;
		this.hunger = 10;
		this.bladder = 10;
		this.dirt = 10;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBladder() {
		return bladder;
	}

	public int getDirt() {
		return dirt;
	}

	// Impacts on Properties
	public void increaseHungerByFive() {
		hunger += 5;
	}

	public void decreaseHungerByFive() {
		hunger -= 5;
	}

	public void increaseBladderByFive() {
		bladder += 5;
	}

	public void decreaseBladderByFive() {
		bladder -= 5;
	}

	public void increaseBoredomByFive() {
		boredom += 5;
	}

	public void decreaseBoredomByFive() {
		boredom -= 5;
	}

	public void increaseDirtByFive() {
		dirt += 5;
	}

	public void decreaseDirtByFive() {
		dirt -= 5;
	}
}