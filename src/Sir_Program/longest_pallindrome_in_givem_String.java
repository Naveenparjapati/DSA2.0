package Sir_Program;

public class longest_pallindrome_in_givem_String {

	public class LongestPalindrome {
	    public static void main(String[] args) {
	        String str = "babad"; // Example input string
	        String longestPalindrome = findLongestPalindrome(str);
	        
	        // Output the longest palindromic substring
	        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
	    }

	    // Method to find the longest palindromic substring
	    public static String findLongestPalindrome(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }

	        // Variables to track the start and end of the longest palindrome
	        int start = 0, end = 0;

	        // Loop through each character in the string as the center
	        for (int i = 0; i < s.length(); i++) {
	            // Expand around the center for odd-length palindromes
	            int len1 = expandAroundCenter(s, i, i);
	            // Expand around the center for even-length palindromes
	            int len2 = expandAroundCenter(s, i, i + 1);
	            
	            // Find the longer palindrome
	            int len = Math.max(len1, len2);
	            
	            // If we found a longer palindrome, update the start and end indices
	            if (len > (end - start)) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }

	        // Return the longest palindromic substring
	        return s.substring(start, end + 1);
	    }

	    // Helper method to expand around the center and return the length of the palindrome
	    public static int expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;  // The length of the palindrome
	    }
	}}
