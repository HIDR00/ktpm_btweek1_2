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

    @Test
    public void testNegativeAndNonPrime() {
        assertFalse(PrimeChecker.isPrime(-10)); // Số âm
        assertFalse(PrimeChecker.isPrime(0));   // Số 0
        assertFalse(PrimeChecker.isPrime(1));   // Số 1
    }

    @Test
    public void testLowestPrime() {
        assertTrue(PrimeChecker.isPrime(2));    // Số nguyên tố nhỏ nhất, không vòng lặp
    }

    @Test
    public void testPrimeNumbers() {
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(11));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(4));   // Chia hết cho 2
        assertFalse(PrimeChecker.isPrime(9));   // Chia hết cho 3
        assertFalse(PrimeChecker.isPrime(15));  // Chia hết cho 3 và 5
    }

    @Test
    public void testLargeNonPrime() {
        assertFalse(PrimeChecker.isPrime(2 * 3 * 5 * 7 + 1));  // Lớn, không phải nguyên tố, không ước số nhỏ
    }
}
