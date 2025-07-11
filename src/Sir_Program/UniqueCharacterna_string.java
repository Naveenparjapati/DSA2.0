package Sir_Program;
import java.util.HashMap;
public class UniqueCharacterna_string {

    public static void main(String[] args) {
        String str = "swiss"; // Example input string
        findUniqueCharacters(str);
    }

    public static void findUniqueCharacters(String str) {
        // Use a HashMap to store the frequency of characters
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        // Now loop through the map to find the unique characters
        System.out.println("Unique characters in the string:");
        for (char key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}
