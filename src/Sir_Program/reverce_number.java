package Sir_Program;

public class reverce_number {

    public static void main(String[] args) {
        int number = 12345; // Given number
        int reversedNumber = 0;
        
        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;          // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10;                     // Remove the last digit
        }
        
        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
