package ua.lviv.iot.athletics.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.athletics.model.AbstractAthletics;

public class AthleticsManager {

	private List<AbstractAthletics> athletics = new LinkedList<>();

	public AthleticsManager(List<AbstractAthletics> athletics) {
		this.athletics = athletics;
	}

	public void addAthletics(List<AbstractAthletics> athletics) {

		this.athletics.addAll(athletics);
	}

	public void addAthletic(AbstractAthletics athletic) {

		this.athletics.add(athletic);
	}

	public static List<AbstractAthletics> findTypesOfAthleticsByDistance(int distanceInMeters,
			List<AbstractAthletics> athletics) {

		List<AbstractAthletics> foundAthletics = new LinkedList<>();
		for (AbstractAthletics athletic : athletics) {

			if (athletic.getDistanceInMeters() == distanceInMeters) {
				foundAthletics.add(athletic);
			}

		}

		return foundAthletics;
	}

}
