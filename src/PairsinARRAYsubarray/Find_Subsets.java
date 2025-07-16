package PairsinARRAYsubarray;

import java.util.ArrayList;

import java.util.List;
public class Find_Subsets {
	    	
	    public static void main(String[] args) {
	
	        String input = "abc";
	
	        List<String> substrings = generateSubstrings(input);
	
	        // Print the substrings in the required format
	
	        System.out.println(String.join(", ", substrings));
	
	    }
	
	    
	
	    public static List<String> generateSubstrings(String str) {
	
	        List<String> result = new ArrayList<>();
	
	        int n = str.length();
	
	        
	
	        // Generate all substrings
	
	        for (int len = 1; len <= n; len++) {          // Length of substring
	
	            for (int i = 0; i <= n - len; i++) {      // Starting index
	
	                int j = i + len;                     // Ending index
	
	                result.add(str.substring(i, j));
	
	            }
	
	        }
	
	        
	
	       return result;
	
	    }
	
	}

