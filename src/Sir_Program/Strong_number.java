package Sir_Program;
import java.util.Scanner;


public class Strong_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Strong number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
