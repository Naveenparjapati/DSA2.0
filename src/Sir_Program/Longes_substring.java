package Sir_Program;
import java.util.HashMap;
public class Longes_substring {

    public static void main(String[] args) {
        String str = "abcabcbb";  // Example string
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(str));
        System.out.println("Longest substring: " + longestSubstring(str));
    }

    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0; // Left pointer of the window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we find a repeating character, move the left pointer
            if (map.containsKey(currentChar)) {
                // Move left to the max of its current position and the position after the previous occurrence of currentChar
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the last seen index of the current character
            map.put(currentChar, right);

            // Calculate the current length and update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Function to find the longest substring without repeating characters
    public static String longestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        int startOfMaxSubstring = 0;  // To store the start index of the longest substring

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);

            // Update max length and the starting index of the longest substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startOfMaxSubstring = left;
            }
        }

        // Return the longest substring
        return s.substring(startOfMaxSubstring, startOfMaxSubstring + maxLength);
    }
}
