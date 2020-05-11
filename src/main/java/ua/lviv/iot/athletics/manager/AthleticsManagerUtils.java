package ua.lviv.iot.athletics.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.athletics.rest.model.AbstractAthletics;
import ua.lviv.iot.athletics.rest.model.SortType;

public class AthleticsManagerUtils {

  private static final AthleticsSorterByStageDuration ATHLETICS_SORTER_BY_STAGE_DURATION = 
          new AthleticsSorterByStageDuration();
  
  private static final AthleticsSorterByNumberOfParticipant ATHLETICS_SORTER_BY_NUMBER_OF_PARTICIPANTS = new AthleticsManagerUtils(). 
          new AthleticsSorterByNumberOfParticipant();

  /**
   * static inner class.
   * @param athletics the element of list
   * @param sortType the type of sorting
   */
  public static void sortTypesOfAthleticsByStageDuration(List<AbstractAthletics> athletics,
            SortType sortType) {
    athletics.sort(sortType == SortType.ASC ? ATHLETICS_SORTER_BY_STAGE_DURATION
                : ATHLETICS_SORTER_BY_STAGE_DURATION.reversed());
  }

  /**
   * static inner class.
   * @param athletics the element of list
   * @param sortType the type of sorting
   */
  public static void sortTypesOfAthleticsByNumberOfParticipants(List<AbstractAthletics> athletics,
            SortType sortType) {
    
    athletics.sort(sortType == SortType.ASC ? ATHLETICS_SORTER_BY_NUMBER_OF_PARTICIPANTS : ATHLETICS_SORTER_BY_NUMBER_OF_PARTICIPANTS.reversed());
  }

  /**
   * anonymous inner class.
   * @param athletics the element of list
   * @param sortType the type of sorting
   */
  public static void sortTypesOfAthleticsByNumberOfRepeat(List<AbstractAthletics> athletics,
            SortType sortType) {
    Comparator<AbstractAthletics> comparator = new Comparator<AbstractAthletics>() {

      @Override
      public int compare(AbstractAthletics firstAthletics,
          AbstractAthletics secondAthletics) {
            double numberOfRepeatResult = firstAthletics.getNumberOfRepeat()
                        - secondAthletics.getNumberOfRepeat();
            if (numberOfRepeatResult != 0) {
              return (int) numberOfRepeatResult;
            }
            return Double.compare(firstAthletics.getNumberOfRepeat(),
                        secondAthletics.getNumberOfRepeat());
          }
      };
    athletics.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  static class AthleticsSorterByStageDuration implements Comparator<AbstractAthletics>,
      Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public int compare(AbstractAthletics firstAthletics, AbstractAthletics secondAthletics) {
      return firstAthletics.getStageDuration() - secondAthletics.getStageDuration();
    }
  }
  
  class AthleticsSorterByNumberOfParticipant implements Comparator<AbstractAthletics>,
  Serializable {
      
     
    private static final long serialVersionUID = 1L;

    @Override
      public int compare(AbstractAthletics firstAthletics, AbstractAthletics secondAthletics) {
          return firstAthletics.getNumberOfParticipants() - secondAthletics.getNumberOfParticipants();
      }
  }



}
