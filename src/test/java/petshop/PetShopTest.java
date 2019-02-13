package petshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import petshop.Pet;
import petshop.PetShop;
import petshop.pets.Dog;

public class PetShopTest {

	PetShop underTest;
	Pet testPet;

	@Before
	public void setup() {
		underTest = new PetShop();
		testPet = new Dog("Buddy");
	}

	@Test
	public void shouldAddPetsToTheShop() {
		int petsCountBeforeAddition = underTest.getPetCount();
		underTest.addPet(testPet);
		int petsCountAfterAddition = underTest.getPetCount();
		assertEquals(petsCountBeforeAddition + 1, petsCountAfterAddition);
	}

	@Test
	public void shouldReHomePetsInTheShop() {
		underTest.addPet(testPet);
		int petCountBeforeSale = underTest.getPetCount();
		underTest.sellPet(testPet);
		int petCountAfterSale = underTest.getPetCount();
		assertEquals(petCountBeforeSale - 1, petCountAfterSale);
	}

	@Test
	public void shouldCallForASpecificPet() {
		underTest.addPet(testPet);
		Pet pet = underTest.callPet(testPet.getName());
		assertEquals(testPet, pet);
	}

	@Test
	public void shouldCleanCages() {
		underTest.cleanCages();
		int shelterAfterCleaning = underTest.getCleanliness();
		assertEquals(100, shelterAfterCleaning);
	}

}
