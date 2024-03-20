import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FactorialTest {
    @Test
    public void testFactorialWithZero() {
        int result = Factorial.factorial(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        int result = Factorial.factorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}
