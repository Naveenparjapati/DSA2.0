package tricKy;


import java.util.*;

    public class Program1 {
	
    public static List<String> getAllPalindromicSubstrings(String s) {
        Set<String> result = new HashSet<>(); 

        for (int center = 0; center < s.length(); center++) {
           
            expandAroundCenter(s, center, center, result);
       
            expandAroundCenter(s, center, center + 1, result);
        }

        return new ArrayList<>(result);
    }

    
    private static void expandAroundCenter(String s, int left, int right, Set<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }
    public static int countPalindromicSubstrings(String s) {
        int count = 0;

        for (int center = 0; center < s.length(); center++) {
            count += countFromCenter(s, center, center);    
            count += countFromCenter(s, center, center + 1); 
        }

        return count;
    }

    private static int countFromCenter(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }

    
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	String input =sc.next();
    	
       //String input = "abbaeae";

        List<String> palindromes = getAllPalindromicSubstrings(input);
        int totalCount = countPalindromicSubstrings(input);

        System.out.println("Total Palindromic Substrings  " + totalCount);
        System.out.println("Unique Palindromic Substrings:");
        for (String p : palindromes) {
            System.out.println(p);
        }
    }
    }
