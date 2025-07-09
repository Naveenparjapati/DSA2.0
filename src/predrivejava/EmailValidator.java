package predrivejava;

public class EmailValidator {

    // Method to validate email format
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false; // Null email is invalid
        }

        int atIndex = email.indexOf('@');
        int lastDotIndex = email.lastIndexOf('.');

        // Check if '@' and '.' are present and '@' appears before the last '.'
        if (atIndex != -1 && lastDotIndex != -1 && atIndex < lastDotIndex) {
            return true; // Valid email format
        }

        return false; // Invalid email format
    }

    // Main method for testing
    public static void main(String[] args) {
      

        // Test cases
        System.out.println(isValidEmail("example@domain.com")); // true
        System.out.println(isValidEmail("user.name@domain.co.uk")); // true
        System.out.println(isValidEmail("user@domain")); // false
        System.out.println(isValidEmail("user@.com")); // false
        System.out.println(isValidEmail("user@domain..com")); // false
        System.out.println(isValidEmail("user@domain.c")); // true
        System.out.println(isValidEmail(null)); // false
    }
}
