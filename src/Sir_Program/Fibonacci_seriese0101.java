package Sir_Program;
//s ModifiedFibonacciSerie 
public class Fibonacci_seriese0101 {

    public static void main(String[] args) {
        int n = 12;  // Length of the series (including the 0s)

        // Print the modified Fibonacci series
        printModifiedFibonacci(n);
    }

    // Function to print the modified Fibonacci series
    public static void printModifiedFibonacci(int n) {
        int[] fibonacciArray = new int[(n + 1) / 2];  // Array to store the Fibonacci numbers

        // Generate Fibonacci numbers
        generateFibonacci(fibonacciArray);

        // Print the modified Fibonacci series
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");  // Print 0 in even positions
            } else {
                System.out.print(fibonacciArray[i / 2] + " ");  // Print Fibonacci number at odd positions
            }
        }
    }

    // Function to generate Fibonacci numbers up to the required count
    public static void generateFibonacci(int[] fibonacciArray) {
        fibonacciArray[0] = 1;  // First Fibonacci number
        fibonacciArray[1] = 2;  // Second Fibonacci number

        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];  // Fibonacci formula
        }
    }
}
