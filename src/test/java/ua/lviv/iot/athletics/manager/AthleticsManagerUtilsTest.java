package ua.lviv.iot.athletics.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.athletics.rest.model.SortType;




public class AthleticsManagerUtilsTest extends BaseAthleticsManagerTest {

    @Test
    public void testSortTypesOfAthleticsByStageDuration() {
        AthleticsManagerUtils.sortTypesOfAthleticsByStageDuration(athletics, SortType.DESC);
        assertEquals(20, athletics.get(0).getStageDuration());
        assertEquals(10, athletics.get(1).getStageDuration());
        assertEquals(5, athletics.get(2).getStageDuration());
    }

    @Test
    public void testSortTypesOfAthleticsByNumberOfParticipants() {
        AthleticsManagerUtils.sortTypesOfAthleticsByNumberOfParticipants(athletics, SortType.DESC);
        assertEquals(20, athletics.get(0).getNumberOfParticipants());
        assertEquals(10, athletics.get(1).getNumberOfParticipants());
        assertEquals(7, athletics.get(2).getNumberOfParticipants());
    }
    
    @Test
    public void testSortTypesOfAthleticsByNumberOfRepeat() {
        AthleticsManagerUtils.sortTypesOfAthleticsByNumberOfRepeat(athletics, SortType.DESC);
        assertEquals(3, athletics.get(0).getNumberOfRepeat());
        assertEquals(2, athletics.get(1).getNumberOfRepeat());
        assertEquals(1, athletics.get(2).getNumberOfRepeat());
    }
    

    
    

}
