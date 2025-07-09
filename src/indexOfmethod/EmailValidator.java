package indexOfmethod;

public class EmailValidator {

    public boolean isValidEmail(String email) {
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
}
