import org.example.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {

    @Test
    public void testIsPrimeWithNegativeNumber() {
        Assertions.assertFalse(Prime.isPrime(-1));
    }

    @Test
    public void testIsPrimeWithZero() {
        Assertions.assertFalse(Prime.isPrime(0));
    }

    @Test
    public void testIsPrimeWithOne() {
        Assertions.assertFalse(Prime.isPrime(1));
    }
    @Test
    public void testIsPrimeWithTwo() {
        Assertions.assertFalse(Prime.isPrime(2));
    }
    @Test
    public void testIsPrimeWithThree() {
        Assertions.assertFalse(Prime.isPrime(3));
    }

    @Test
    public void testIsPrimeWithPrimeNumber() {
        Assertions.assertTrue(Prime.isPrime(2));
        Assertions.assertTrue(Prime.isPrime(3));
        Assertions.assertTrue(Prime.isPrime(5));
        Assertions.assertTrue(Prime.isPrime(7));
        Assertions.assertTrue(Prime.isPrime(11));
        Assertions.assertTrue(Prime.isPrime(13));
        Assertions.assertTrue(Prime.isPrime(17));
    }

    @Test
    public void testIsPrimeWithCompositeNumber() {
        Assertions.assertFalse(Prime.isPrime(4));
        Assertions.assertFalse(Prime.isPrime(6));
        Assertions.assertFalse(Prime.isPrime(8));
        Assertions.assertFalse(Prime.isPrime(9));
        Assertions.assertFalse(Prime.isPrime(10));
        Assertions.assertFalse(Prime.isPrime(12));
    }
}
