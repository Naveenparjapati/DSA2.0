package Sir_Program;

public class longest_pallindrom_ein_a_given_entence {

    public static void main(String[] args) {
        String sentence = "Madam arora teaches malayalam"; // Example input sentence
        String longestPalindrome = findLongestPalindrome(sentence);
        
        // Output the longest palindromic word
        System.out.println("Longest Palindrome: " + longestPalindrome);
    }

    // Method to find the longest palindromic word in a sentence
    public static String findLongestPalindrome(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        String longestPalindrome = "";
        
        // Iterate through each word in the sentence
        for (String word : words) {
            // Check if the word is a palindrome and longer than the current longest palindrome
            if (isPalindrome(word) && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }
        
        return longestPalindrome; // Return the longest palindrome found
    }

    // Helper method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        
        // Check if the word is equal to its reverse
        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}
