package petshop;

import java.util.HashMap;

public class PetShop {

	// Properties
	private int cleanliness = 100;

	// Constructor
	private HashMap<String, Pet> pets = new HashMap<String, Pet>();

	// Getters
	public int getCleanliness() {
		return cleanliness;
	}

	// Methods
	public int getPetCount() {
		return pets.size();
	}

	public void addPet(Pet newPet) {
		pets.put(newPet.getName(), newPet);
	}

	public void sellPet(Pet soldPet) {
		pets.remove(soldPet.getName());
	}

	public Pet callPet(String petName) {
		return pets.get(petName);
	}

	public void cleanCages() {
		cleanliness = 100;
	}

}
