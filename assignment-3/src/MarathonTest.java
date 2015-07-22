import static org.junit.Assert.*;

/**
 * Created by kevindlee on 7/21/15.
 */
public class MarathonTest {

    @org.junit.Test
    public void testGetFastestTime() throws Exception {
        int[] times = {
                1
        };
        int index = Marathon.getFastestTime(times);
        assertEquals(index, 0);
    }
    @org.junit.Test
    public void testGetFastestTime1() throws Exception {
        int[] times = {
                2,1
        };
        int index = Marathon.getFastestTime(times);
        assertEquals(index, 1);
    }
    @org.junit.Test
    public void testGetFastestTime2() throws Exception {
        int[] times = {
                2,1,3
        };
        int index = Marathon.getFastestTime(times);
        assertEquals(index, 1);
    }
    @org.junit.Test
    public void testGetFastestTime3() throws Exception {
        int[] times = {
                2,1,3,1
        };
        int index = Marathon.getFastestTime(times);
        assertEquals(index, 1);
    }
    @org.junit.Test
    public void testGetSecondFastestTime() throws Exception {
        int[] times = {
                2,1
        };
        int index = Marathon.getSecondFastestTime(times);
        assertEquals(index, 0);
    }   @org.junit.Test
        public void testGetSecondFastestTime1() throws Exception {
        int[] times = {
                1,1
        };
        int index = Marathon.getSecondFastestTime(times);
        assertEquals(index, 1);
    }
}