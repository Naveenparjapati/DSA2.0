package PrimeNumbers;

public class Number_is_prime_and_even {


    public static void main(String[] args) {
        int count = 0;
        int limit = 100;  // You can change this value

        for (int i = 2; i <= limit; i++) {
            if (i % 2 == 0 && isPrime(i)) {
                count++;
                System.out.println(i + " is an even prime number.");
            }
        }

        System.out.println("Total even prime numbers up to " + limit + ": " + count);
    }

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
