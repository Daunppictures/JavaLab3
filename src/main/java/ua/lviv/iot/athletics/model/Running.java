package ua.lviv.iot.athletics.model;

public class Running extends AbstractAthletics {

	protected String typesOfRunning;

	public Running(int distanceInMeters, int stageDuration, int numberOfParticipants, int numberOfRepeat) {
		super(distanceInMeters);
		this.stageDuration = stageDuration;
		this.numberOfParticipants = numberOfParticipants;
		this.numberOfRepeat = numberOfRepeat;
	}

	public String getTypesOfRunning() {
		return typesOfRunning;
	}

	public void setTypesOfRunning(String typesOfRunning) {
		this.typesOfRunning = typesOfRunning;
	}

}