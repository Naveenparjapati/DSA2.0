package Sir_Program;
import java.util.HashSet;
import java.util.Set;

public class number_719_shift_digits_197_and_971_all_three_prime_or_not {
    public static void main(String[] args) {
        // Given number
        int number = 719;
        
        // Generate permutations of the digits of the number
        Set<Integer> permutations = generatePermutations(number);
        
        // Check if each permutation is prime
        for (int perm : permutations) {
            System.out.println(perm + " is prime? " + isPrime(perm));
        }
    }

    // Method to generate all unique permutations of the digits of a number
    public static Set<Integer> generatePermutations(int number) {
        String numStr = String.valueOf(number);
        Set<Integer> permutations = new HashSet<>();  // Use a HashSet to avoid duplicates
        
        permute(numStr, "", permutations);
        
        return permutations;
    }

    // Helper method to generate permutations
    private static void permute(String str, String prefix, Set<Integer> permutations) {
        int n = str.length();
        if (n == 0) {
            // Convert the generated permutation string to an integer and add to set
            permutations.add(Integer.parseInt(prefix));
        } else {
            for (int i = 0; i < n; i++) {
                // Prevent duplicates by skipping same characters in the same position
                permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), permutations);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        
        // Check divisibility up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Not prime if divisible by any number other than 1 and itself
            }
        }
        
        return true;  // Prime if no divisors found
    }
}
