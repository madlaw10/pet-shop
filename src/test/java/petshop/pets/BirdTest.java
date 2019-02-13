package petshop.pets;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import petshop.pets.Bird;

public class BirdTest {

	Bird underTest;

	@Before
	public void setup() {
		underTest = new Bird("Polly");
	}

	@Test
	public void shouldHaveAName() {
		String testName = underTest.getName();
		assertEquals("Polly", testName);
	}

	@Test
	public void shouldHaveFunWhenFlying() {
		int boredomBeforeFlying = underTest.getBoredom();
		underTest.fly();
		int boredomAfterFlying = underTest.getBoredom();
		assertEquals(boredomBeforeFlying - 5, boredomAfterFlying);
	}

	@Test
	public void shouldGetHungryWhenFlying() {
		int hungerBeforeFlying = underTest.getHunger();
		underTest.fly();
		int hungerAfterFlying = underTest.getHunger();
		assertEquals(hungerBeforeFlying + 5, hungerAfterFlying);
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
	public void shouldSelfRelieve() {
		int bladderBeforeSelfRelief = underTest.getBladder();
		underTest.selfRelief();
		int bladderAfterSelfRelief = underTest.getBladder();
		assertEquals(bladderBeforeSelfRelief - 5, bladderAfterSelfRelief);
	}

	@Test
	public void shouldGetDirtyAfterSelfRelief() {
		int dirtBeforeSelfRelief = underTest.getDirt();
		underTest.selfRelief();
		int dirtAfterSelfRelief = underTest.getDirt();
		assertEquals(dirtBeforeSelfRelief + 5, dirtAfterSelfRelief);
	}

	@Test
	public void shouldGetCleanAfterPreening() {
		int dirtBeforePreening = underTest.getDirt();
		underTest.preen();
		int dirtAfterPreening = underTest.getDirt();
		assertEquals(dirtBeforePreening - 5, dirtAfterPreening);
	}

}
