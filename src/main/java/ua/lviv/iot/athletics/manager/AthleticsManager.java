package ua.lviv.iot.athletics.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.athletics.rest.model.AbstractAthletics;

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
  
  /**
   * Method for search by distance.
   * @param distanceInMeters the running of distance 
   * @return athletics list
   */
  public List<AbstractAthletics> findTypesOfAthleticsByDistance(int distanceInMeters) {

    List<AbstractAthletics> foundAthletics = new LinkedList<>();
    for (AbstractAthletics athletic : athletics) {

      if (athletic.getDistanceInMeters() == distanceInMeters) {
        foundAthletics.add(athletic);
      }

    }

    return foundAthletics;
  }

  public List<AbstractAthletics> getAthletics() {
    return athletics;
  }

  public void setAthletics(List<AbstractAthletics> athletics) {
    this.athletics = athletics;
  }

}
