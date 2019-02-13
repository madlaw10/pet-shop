package petshop.pets;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import petshop.pets.Dog;

public class DogTest {

	Dog underTest;

	@Before
	public void setup() {
		underTest = new Dog("Buddy");
	}

	@Test
	public void shouldHaveAName() {
		String testName = underTest.getName();
		assertEquals("Buddy", testName);
	}

	@Test
	public void shouldHaveFunWhenPlaying() {
		int boredomBeforePlay = underTest.getBoredom();
		underTest.play();
		int boredomAfterPlay = underTest.getBoredom();
		assertEquals(boredomBeforePlay -5, boredomAfterPlay);
	}

	@Test
	public void shouldGetHungryWhenPlaying() {
		int hungerBeforePlay = underTest.getHunger();
		underTest.play();
		int hungerAfterPlay = underTest.getHunger();
		assertEquals(hungerBeforePlay + 5, hungerAfterPlay);
	}

	@Test
	public void shouldFeelSatiatedWhenFed() {
		int hungerBeforeBeingFed = underTest.getHunger();
		underTest.feed();
		int hungerAfterBeingFed = underTest.getHunger();
		assertEquals(hungerBeforeBeingFed - 5, hungerAfterBeingFed);
	}

	@Test
	public void shouldFillTheTankWhenFed() {
		int bladderBeforeBeingFed = underTest.getBladder();
		underTest.feed();
		int bladderAfterBeingFed = underTest.getBladder();
		assertEquals(bladderBeforeBeingFed + 5, bladderAfterBeingFed);
	}

	@Test
	public void shouldDrainTheTankWhenWalked() {
		int bladderBeforeBeingWalked = underTest.getBladder();
		underTest.walk();
		int bladderAfterBeingWalked = underTest.getBladder();
		assertEquals(bladderBeforeBeingWalked - 5, bladderAfterBeingWalked);
	}

	@Test
	public void shouldGetDirtyWhenWalked() {
		int dirtBeforeBeingWalked = underTest.getDirt();
		underTest.walk();
		int dirtAfterBeingWalked = underTest.getDirt();
		assertEquals(dirtBeforeBeingWalked + 5, dirtAfterBeingWalked);
	}

	@Test
	public void shouldGetCleanWhenBathed() {
		int dirtBeforeBath = underTest.getDirt();
		underTest.bathe();
		int dirtAfterBath = underTest.getDirt();
		assertEquals(dirtBeforeBath - 5, dirtAfterBath);
	}

}
