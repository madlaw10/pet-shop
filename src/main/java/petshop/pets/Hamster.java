package petshop.pets;

import petshop.Pet;
import petshop.interfaces.CleansSelf;
import petshop.interfaces.EatsWhenFed;
import petshop.interfaces.RelievesWhenever;
import petshop.interfaces.RollsInABall;

public class Hamster extends Pet implements CleansSelf, EatsWhenFed, RelievesWhenever, RollsInABall {

	public Hamster(String name) {
		super(name);
	}
	
	@Override
	public void selfRelief() {
		decreaseBladderByFive();
		increaseDirtByFive();
	}

	@Override
	public void feed() {
		decreaseHungerByFive();
		increaseBladderByFive();
	}

	@Override
	public void preen() {
		decreaseDirtByFive();
	}

	@Override
	public void roll() {
		decreaseBoredomByFive();
		increaseHungerByFive();		
	}

}
