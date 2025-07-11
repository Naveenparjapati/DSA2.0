package Sir_Program;
import java.util.*;
public class Combinatio_nof_a_given_String {


    public static void main(String[] args) {
        String input = "ABC";  // Input string
        List<String> combinations = getCombinations(input);
        
        System.out.println("Combinations of the string \"" + input + "\":");
        for (String combo : combinations) {
            System.out.println(combo);
        }
    }

    // Function to generate all combinations
    public static List<String> getCombinations(String str) {
        List<String> result = new ArrayList<>();
        generateCombinations(str, 0, "", result);
        return result;
    }

    // Helper function to generate combinations using recursion
    private static void generateCombinations(String str, int index, String current, List<String> result) {
        // Base case: If we've processed all characters, add the current combination to the result
        if (index == str.length()) {
            result.add(current);
            return;
        }

        // Include the current character in the combination
        generateCombinations(str, index + 1, current + str.charAt(index), result);

        // Exclude the current character from the combination
        generateCombinations(str, index + 1, current, result);
    }
}
