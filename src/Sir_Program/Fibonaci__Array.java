package Sir_Program;
import java.util.Scanner;
public class Fibonaci__Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of terms in the Fibonacci series from the user
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Create an array to store the Fibonacci series
        int[] fibonacciArray = new int[n];

        // Generate the Fibonacci series and store it in the array
        generateFibonacci(fibonacciArray, n);

        // Display the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }

    // Function to generate Fibonacci series and store it in an array
    public static void generateFibonacci(int[] fibonacciArray, int n) {
        // Base cases for the first two terms
        if (n > 0) {
            fibonacciArray[0] = 0; // First Fibonacci number
        }
        if (n > 1) {
            fibonacciArray[1] = 1; // Second Fibonacci number
        }

        // Generate Fibonacci numbers starting from the third term
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
    }
}
