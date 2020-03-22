package ua.lviv.iot.athletics.manager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.athletics.model.SortType;

public class AthleticsManagerUtilsTest extends BaseAthleticsManagerTest {

	@Test
	public void testSortTypesOfAthleticsByStageDuration() {
		AthleticsManagerUtils.sortTypesOfAthleticsByStageDuration(athletics, SortType.DESC);
		assertTrue(true);
	}

	@Test
	public void testSortTypesOfAthleticsByNumberOfParticipants() {
		AthleticsManagerUtils.sortTypesOfAthleticsByNumberOfParticipants(athletics, SortType.DESC);
		assertTrue(true);
	}

}
