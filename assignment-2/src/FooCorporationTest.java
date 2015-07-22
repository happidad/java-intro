import org.junit.Assert;
import org.junit.Test;


/**
 * Created by kevindlee on 7/19/15.
 */
public class FooCorporationTest {

    @Test
    public void testCalculatePayNominal() throws Exception {
        double expected = 320;
        double result = FooCorporation.calculatePay(8.0, 40);
        Assert.assertEquals(expected, result,0.001    );
    }

    @Test
    public void testCalculatePayOvertime() throws Exception {
        double expected = 720;
        double result = FooCorporation.calculatePay(8.0, 60);
        Assert.assertEquals(expected, result,0.001    );
    }

    @Test
    public void testCalculatePayMinimumWage() throws Exception {
        double expected = 0;
        double result = FooCorporation.calculatePay(7.9, 40);
        Assert.assertEquals(expected, result,0.001    );
    }

    @Test
    public void testCalculatePayTooManyHours() throws Exception {
        double expected = 0;
        double result = FooCorporation.calculatePay(10.0, 61);
        Assert.assertEquals(expected, result,0.001    );
    }

    @Test
    public void testCalculatePayExercise() throws Exception {
        double expected = 0;
        double result = FooCorporation.calculatePay(7.50, 35);
        Assert.assertEquals(expected, result,0.001    );

        expected = 578.1;
        result = FooCorporation.calculatePay(8.20, 47);
        Assert.assertEquals(expected, result,0.001    );

        expected = 0;
        result = FooCorporation.calculatePay(10.0, 73);
        Assert.assertEquals(expected, result,0.001    );
    }
}