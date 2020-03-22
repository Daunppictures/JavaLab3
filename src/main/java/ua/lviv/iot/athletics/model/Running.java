package ua.lviv.iot.athletics.model;

public class Running extends AbstractAthletics {

	protected String typesOfRunning;

	public Running(int getDistanceInMeters) {
		super(getDistanceInMeters);

	}

	public String getTypesOfRunning() {
		return typesOfRunning;
	}

	public void setTypesOfRunning(String typesOfRunning) {
		this.typesOfRunning = typesOfRunning;
	}

}
