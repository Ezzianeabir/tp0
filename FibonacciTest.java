
    import org.example.Fibonacci;
    import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class FibonacciTest {

        @Test
        public void testFibonacciWithZero() {
            int result = Fibonacci.fibonacci(0);
            Assertions.assertEquals(0, result);
        }

        @Test
        public void testFibonacciWithOne() {
            int result = Fibonacci.fibonacci(1);
            Assertions.assertEquals(1, result);
        }

        @Test
        public void testFibonacciWithPositiveNumber() {
            int result = Fibonacci.fibonacci(6);
            Assertions.assertEquals(8, result);
        }

        @Test
        public void testFibonacciWithNegativeNumber() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Fibonacci.fibonacci(-1);
            });
        }
    }


