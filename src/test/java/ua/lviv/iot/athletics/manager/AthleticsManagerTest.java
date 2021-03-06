package ua.lviv.iot.athletics.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.athletics.model.AbstractAthletics;
import ua.lviv.iot.athletics.manager.AthleticsManager;

class AthleticsManagerTest extends BaseAthleticsManagerTest {

	AthleticsManager athleticsManager;

	@BeforeEach
	public void setUp() {
		athleticsManager = new AthleticsManager(athletics);
	}

	@Test
	public void testFindTypesOfAthleticsByDistance() {

		assertEquals(100, athletics.get(0).getDistanceInMeters());
		assertEquals(200, athletics.get(1).getDistanceInMeters());
		assertEquals(300, athletics.get(2).getDistanceInMeters());

	}

}
