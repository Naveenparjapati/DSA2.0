package PrimeNumbers;

public class Twin_Prime_Number {
	//A twin prime is a prime number that has a prime gap of 2 — that is, the difference between the two prime numbers is 2.
//	✅ Examples:
//		(3, 5)
//
//		(5, 7)
//
//		(11, 13)
//
//		(17, 19)
	
    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Print twin primes up to a limit
    public static void printTwinPrimes(int limit) {
        System.out.println("Twin Primes up to " + limit + ":");
        for (int i = 2; i <= limit - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int limit = 100;
        printTwinPrimes(limit);
    }
}
