package petshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PetSuppliesTest {

	PetSupplies underTest;

	@Before
	public void setup() {
		underTest = new PetSupplies();
	}

	@Test
	public void shouldUsePetFoodWhenFeeding() {
		int foodSupplyBeforeFeeding = underTest.getFoodSupply();
		underTest.usePetFood();
		int foodSupplyAfterFeeding = underTest.getFoodSupply();
		assertEquals(foodSupplyBeforeFeeding - 10, foodSupplyAfterFeeding);
	}

	@Test
	public void shouldRestockFood() {
		int foodSupplyBeforeRestocking = underTest.getFoodSupply();
		underTest.restockPetFood();
		int foodSupplyAfterRestocking = underTest.getFoodSupply();
		assertEquals(foodSupplyBeforeRestocking + 10, foodSupplyAfterRestocking);
	}
	
	@Test
	public void shouldUseCatLitterWhenCleaning() {
		int litterSupplyBeforeCleaning = underTest.getLitterSupply();
		underTest.useCatLitter();
		int litterSupplyAfterCleaning = underTest.getLitterSupply();
		assertEquals(litterSupplyBeforeCleaning - 10, litterSupplyAfterCleaning);
	}

	@Test
	public void shouldRestockLitter() {
		int litterSupplyBeforeRestocking = underTest.getLitterSupply();
		underTest.restockCatLitter();
		int litterSupplyAfterRestocking = underTest.getLitterSupply();
		assertEquals(litterSupplyBeforeRestocking + 10, litterSupplyAfterRestocking);
	}
	
	@Test
	public void shouldUseBeddingWhenCleaning() {
		int beddingSupplyBeforeCleaning = underTest.getBeddingSupply();
		underTest.useBedding();
		int beddingSupplyAfterCleaning = underTest.getBeddingSupply();
		assertEquals(beddingSupplyBeforeCleaning - 10, beddingSupplyAfterCleaning);
	}

	@Test
	public void shouldRestockBedding() {
		int beddingSupplyBeforeRestocking = underTest.getBeddingSupply();
		underTest.restockBedding();
		int beddingSupplyAfterRestocking = underTest.getBeddingSupply();
		assertEquals(beddingSupplyBeforeRestocking + 10, beddingSupplyAfterRestocking);
	}

}
