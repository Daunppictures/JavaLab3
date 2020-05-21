package ua.lviv.iot.athletics.rest.model;

import ua.lviv.iot.athletics.rest.model.AbstractAthletics;

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
  
  public String getHeaders() {
      return super.getHeaders() + ", " + "typesOfJumping" + ", " + "jumpDistanceInCentimeters";
  }
  
  public String toCSV() {
      return super.toCSV() + ", " + getTypesOfJumping() + ", " + getJumpDistanceInCentimeters();
  }

}