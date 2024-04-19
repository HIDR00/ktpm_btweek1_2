import org.example.PrimeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testIsPrime() {
        // Test with a prime number
        assertTrue(PrimeChecker.isPrime(11));

        // Test with a non-prime number
        assertFalse(PrimeChecker.isPrime(10));

        // Test with the smallest prime number
        assertTrue(PrimeChecker.isPrime(2));

        // Test with a number less than 2
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(-1));
    }
}
