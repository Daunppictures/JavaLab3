package ua.lviv.iot.athletics.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.athletics.model.AbstractAthletics;
import ua.lviv.iot.athletics.model.Running;

public abstract class BaseAthleticsManagerTest {

	protected List<AbstractAthletics> athletics;

	@BeforeEach
	public void createRunning() {
		athletics = new LinkedList<AbstractAthletics>();
		athletics.add(new Running(10));
		athletics.add(new Running(20));
		athletics.add(new Running(30));
	}
}
