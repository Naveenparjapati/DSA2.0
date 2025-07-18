package Sir_Program;

public class ArmStrong_Number {
    public static void main(String[] args) {
        int number = 153; // You can change this to any number
        int original = number;
        int result = 0;
        int digits = 0;

        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate the sum of digits raised to the power of digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if it's an Armstrong number
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
