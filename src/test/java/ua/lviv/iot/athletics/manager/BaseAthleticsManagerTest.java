package ua.lviv.iot.athletics.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.athletics.rest.model.AbstractAthletics;
import ua.lviv.iot.athletics.rest.model.Running;

public abstract class BaseAthleticsManagerTest {

	protected List<AbstractAthletics> athletics;

	@BeforeEach
	public void createRunning() {
		athletics = new LinkedList<AbstractAthletics>();
		
		athletics.add(new Running(100, 20, 7, 1));
		athletics.add(new Running(200, 10, 10, 2));
		athletics.add(new Running(300, 5, 20, 3));

	}
}
