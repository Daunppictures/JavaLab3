package ua.lviv.iot.athletics.rest.model;

import ua.lviv.iot.athletics.rest.model.AbstractAthletics;

public class Running extends AbstractAthletics {

  protected String typesOfRunning;
  
  /**
   * constructor of running objects.
   * @param distanceInMeters the running distance
   * @param stageDuration duration of running stage
   * @param numberOfParticipants number of runners 
   * @param numberOfRepeat number of running repeat 
   */
  public Running(int distanceInMeters, int stageDuration, int numberOfParticipants,
            int numberOfRepeat) {
    super(distanceInMeters);
    this.stageDuration = stageDuration;
    this.numberOfParticipants = numberOfParticipants;
    this.numberOfRepeat = numberOfRepeat;
  }
  
  public Running() {
      super();
  }

  public String getTypesOfRunning() {
    return typesOfRunning;
  }

  public void setTypesOfRunning(String typesOfRunning) {
    this.typesOfRunning = typesOfRunning;
  }
  
  public String getHeaders() {
      return super.getHeaders() + ", " + "typesOfRunning";
  }
  
  public String toCSV() {
      return super.toCSV() + ", " + getTypesOfRunning();
  }

}