import org.example.Leapyear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LeapyearTest {
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        Leapyear ly = new Leapyear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
    @Test
    public void leapCenturialYears() {
        Leapyear ly = new Leapyear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }
    @Test
    public void nonLeapCenturialYears() {
        Leapyear ly = new Leapyear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        Leapyear ly = new Leapyear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
