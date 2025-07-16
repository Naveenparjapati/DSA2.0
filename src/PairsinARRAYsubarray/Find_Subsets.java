package PairsinARRAYsubarray;

public class Find_Subsets {
	    
	    public static void FindSubSets(String str, String ans, int i) {
	        // Base case
	        if (i == str.length()) {
	            if (ans.isEmpty()) {
	                System.out.print("null "); // Print "null" for the empty subset
	            } else {
	                System.out.print(ans + " "); // Print the current subset
	            }
	            return;
	        }
	        // Exclude the current character
	        FindSubSets(str, ans, i + 1);
	        // Include the current character
	        FindSubSets(str, ans + str.charAt(i), i + 1);
	    }
	    
	    public static void main(String[] args) {
	        String str = "123";
	        FindSubSets(str, "", 0); // Start with index 0
	    }
	}

