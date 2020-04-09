package ua.lviv.iot.athletics.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.athletics.model.AbstractAthletics;
import ua.lviv.iot.athletics.model.SortType;

public class AthleticsManagerUtils {
	
	private static final AthleticsSorterByAge ATHLETICS_SORTER_BY_STAGE_DURATION = new AthleticsSorterByAge();
	
	//static inner class
	public static void sortTypesOfAthleticsByStageDuration(List<AbstractAthletics> athletics, SortType sortType) {
		athletics.sort(sortType == SortType.ASC ? ATHLETICS_SORTER_BY_STAGE_DURATION : ATHLETICS_SORTER_BY_STAGE_DURATION.reversed());
	}

	
	//static inner class
	public static void sortTypesOfAthleticsByNumberOfParticipants(List<AbstractAthletics> athletics,
			SortType sortType) {
		Comparator<AbstractAthletics> comparator = Comparator.comparing(AbstractAthletics::getNumberOfParticipants);
		athletics.sort(sortType == sortType.ASC ? comparator : comparator.reversed());
	}
	
	//anonymous inner class
	public static void sortTypesOfAthleticsByNumberOfRepeat(List<AbstractAthletics> athletics, SortType sortType) {
		Comparator<AbstractAthletics> comparator = new Comparator<AbstractAthletics>() {
			
			
			@Override
			public int compare(AbstractAthletics firstAthletics, AbstractAthletics secondAthletics) {
				double numberOfRepeatResult = firstAthletics.getNumberOfRepeat() - secondAthletics.getNumberOfRepeat();
				if (numberOfRepeatResult != 0) {
					return (int) numberOfRepeatResult;
				}
				return Double.compare(firstAthletics.getNumberOfRepeat(), secondAthletics.getNumberOfRepeat());
			}
		};
		athletics.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
	}
	
	
	static class AthleticsSorterByAge implements Comparator<AbstractAthletics>, Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Override 
		public int compare(AbstractAthletics firstAthletics, AbstractAthletics secondAthletics) {
			return firstAthletics.getStageDuration() - secondAthletics.getStageDuration();
		}
	}
	
	

}
