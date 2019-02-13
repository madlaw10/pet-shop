package petshop.pets;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HamsterTest {

	Hamster underTest;

	@Before
	public void setup() {
		underTest = new Hamster("Jerry");
	}

	@Test
	public void shouldHaveFunRollingInBall() {
		int boredomBeforeRolling = underTest.getBoredom();
		underTest.roll();
		int boredomAfterRolling = underTest.getBoredom();
		assertEquals(boredomBeforeRolling - 5, boredomAfterRolling);
	}

	@Test
	public void shouldGetHungryWhenRolling() {
		int hungerBeforeRolling = underTest.getHunger();
		underTest.roll();
		int hungerAfterRolling = underTest.getHunger();
		assertEquals(hungerBeforeRolling + 5, hungerAfterRolling);
	}

}
