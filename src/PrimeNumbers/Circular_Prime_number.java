package PrimeNumbers;

//197 is a circular prime because all rotations — 197, 971, and 719 — are prime.
public class Circular_Prime_number {

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Rotate the number (e.g., 197 → 971 → 719)
    public static boolean isCircularPrime(int num) {
        String str = String.valueOf(num);
        int len = str.length();

        for (int i = 0; i < len; i++) {
            int rotated = Integer.parseInt(str);
            if (!isPrime(rotated)) return false;

            // Rotate left
            str = str.substring(1) + str.charAt(0);
        }

        return true;
    }

    // Main method to test circular primes
    public static void main(String[] args) {
        int num = 197;

        if (isCircularPrime(num)) {
            System.out.println(num + " is a Circular Prime");
        } else {
            System.out.println(num + " is NOT a Circular Prime");
        }
    }
}
