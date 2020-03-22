package ua.lviv.iot.athletics.model;

public class Jumping extends AbstractAthletics {

	protected String typesOfJumping;

	protected int jumpDistanceInCentimeters;

	public Jumping(int stageDuration) {
		super(stageDuration);

	}

	public String getTypesOfJumping() {
		return typesOfJumping;
	}

	public void setTypesOfJumping(String typesOfJumping) {
		this.typesOfJumping = typesOfJumping;
	}

	public int getJumpDistanceInCentimeters() {
		return jumpDistanceInCentimeters;
	}

	public void setJumpDistanceInCentimeters(int jumpDistanceInCentimeters) {
		this.jumpDistanceInCentimeters = jumpDistanceInCentimeters;
	}

}
