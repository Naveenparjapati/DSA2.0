package Sir_Program;

public class Sum_of_number {

    public static void main(String[] args) {
        int number = 123; // Given number
        int sum = 0;
        
        // Loop to extract digits and sum them
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }
        
        // Output the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
