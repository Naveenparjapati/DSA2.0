package predrivejava;

public class longest_common_prefix_leetcode14 {

	    public static String findCommonPrefix(String[] words) {
	        if (words.length == 0) {
	            return ""; 
	        }

	        String firstWord = words[0]; 
	        
	        for (int i = 0; i < firstWord.length(); i++) {
	            char currentChar = firstWord.charAt(i);
	            
	            // Check this character against all other words
	            for (int j = 1; j < words.length; j++) {
	                if (i >= words[j].length() || words[j].charAt(i) != currentChar) {
	                    return firstWord.substring(0, i); // Return prefix up to mismatch
	                }
	            }
	        }
	        
	        return firstWord; // All words matched completely
	    }

	    public static void main(String[] args) {
	        String[] test1 = {"flower", "flow", "flight"};
	        String[] test2 = {"dog", "racecar", "car"};
	        
	        System.out.println("Common prefix 1: " + findCommonPrefix(test1)); // "fl"
	        System.out.println("Common prefix 2: " + findCommonPrefix(test2)); // ""
	    }
	}
	
