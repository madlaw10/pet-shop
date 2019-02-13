package petshop.pets;
import petshop.Pet;
import petshop.interfaces.EatsWhenFed;
import petshop.interfaces.GoesForWalks;
import petshop.interfaces.LikesToPlay;
import petshop.interfaces.NeedsBaths;

public class Dog extends Pet implements EatsWhenFed, GoesForWalks, NeedsBaths, LikesToPlay {

	// Properties

	// Constructor
	public Dog(String name) {
		super(name);
	}

	// Implemented Methods
	@Override
	public void feed() {
		this.decreaseHungerByFive();
		this.increaseBladderByFive();
	}

	@Override
	public void walk() {
		this.decreaseBladderByFive();
		this.increaseDirtByFive();
	}

	@Override
	public void bathe() {
		this.decreaseDirtByFive();
	}

	@Override
	public void play() {
		this.decreaseBoredomByFive();
		this.increaseHungerByFive();
	}

}
