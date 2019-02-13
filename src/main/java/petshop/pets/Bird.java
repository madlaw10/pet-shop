package petshop.pets;
import petshop.Pet;
import petshop.interfaces.CleansSelf;
import petshop.interfaces.EatsWhenFed;
import petshop.interfaces.Flies;
import petshop.interfaces.RelievesWhenever;

public class Bird extends Pet implements EatsWhenFed, RelievesWhenever, CleansSelf, Flies {

	// Properties

	// Constructor
	public Bird(String name) {
		super(name);
	}

	// Implemented Methods
	@Override
	public void fly() {
		decreaseBoredomByFive();
		increaseHungerByFive();
	}

	@Override
	public void feed() {
		decreaseHungerByFive();
		increaseBladderByFive();
	}

	@Override
	public void selfRelief() {
		decreaseBladderByFive();
		increaseDirtByFive();
	}

	@Override
	public void preen() {
		decreaseDirtByFive();
	}

}
