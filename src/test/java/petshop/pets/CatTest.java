package petshop.pets;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import petshop.pets.Cat;

public class CatTest {
	
	Cat underTest;
	
	@Before
	public void setup() {
		underTest = new Cat("Sprinkles");
	}
	
	@Test
	public void shouldHaveAName() {
		String testName = underTest.getName();
		assertEquals("Sprinkles", testName);
	}
	
	@Test
	public void shouldHaveFunWhenHunting() {
		int boredomBeforeHunting = underTest.getBoredom();
		underTest.hunt();
		int boredomAfterHunting = underTest.getBoredom();
		assertEquals(boredomBeforeHunting - 5, boredomAfterHunting);
	}
	
	@Test
	public void shouldFeelSatiatedAfterHunting() {
		int hungerBeforeHunting = underTest.getHunger();
		underTest.hunt();
		int hungerAfterHunting = underTest.getHunger();
		assertEquals(hungerBeforeHunting - 5, hungerAfterHunting);
	}
	
	@Test
	public void shouldFillTheTankAfterHunting() {
		int bladderBeforeHunting = underTest.getBladder();
		underTest.hunt();
		int bladderAfterHunting = underTest.getBladder();
		assertEquals(bladderBeforeHunting + 5, bladderAfterHunting);
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
