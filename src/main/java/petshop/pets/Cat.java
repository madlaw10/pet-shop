package petshop.pets;
import petshop.Pet;
import petshop.interfaces.CleansSelf;
import petshop.interfaces.EatsByHunting;
import petshop.interfaces.RelievesWhenever;

public class Cat extends Pet implements EatsByHunting, RelievesWhenever, CleansSelf {

	// Properties

	// Constructor
	public Cat(String name) {
		super(name);
	}

	// Implemented Methods
	@Override
	public void hunt() {
		this.decreaseBoredomByFive();
		this.decreaseHungerByFive();
		this.increaseBladderByFive();
	}

	@Override
	public void selfRelief() {
		this.decreaseBladderByFive();
		this.increaseDirtByFive();
	}

	@Override
	public void preen() {
		this.decreaseDirtByFive();
	}

}
