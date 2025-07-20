package MAth_related;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DOBProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Date of Birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        try {
            // Define the date format expected from the user
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            // Parse the string input into a Date object
            Date dateOfBirth = dateFormat.parse(dobString);

            System.out.println("Your Date of Birth is: " + dateFormat.format(dateOfBirth));

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }
}