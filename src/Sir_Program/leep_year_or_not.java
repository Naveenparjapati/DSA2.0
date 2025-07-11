package Sir_Program;

import java.util.Scanner;
public class leep_year_or_not {


    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 400, or divisible by 4 but not by 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
