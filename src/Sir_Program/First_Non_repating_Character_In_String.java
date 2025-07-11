package Sir_Program;
import java.util.HashMap;
public class First_Non_repating_Character_In_String {



    public static void main(String[] args) {
        String str = "swiss";  // Example input
        char result = firstNonRepeatedChar(str);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    // Function to find the first non-repeated character in a string
    public static char firstNonRepeatedChar(String str) {
        // Step 1: Create a frequency map to count occurrences of each character
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Step 2: Iterate through the string to find the first character with count = 1
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCountMap.get(currentChar) == 1) {
                return currentChar;  // Return the first non-repeated character
            }
        }

        // If no non-repeated character is found, return a special character (e.g., '\0')
        return '\0';
    }
}
