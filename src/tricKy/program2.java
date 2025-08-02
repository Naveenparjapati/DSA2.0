package tricKy;


import java.util.*;

public class program2  {

    public static int minDeletionsToMakeAnagram(String str1, String str2) {
        int[] freq1 = new int[26]; 
        int[] freq2 = new int[26];

        for (char c : str1.toCharArray()) {
            freq1[c - 'a']++;
        }

    
        for (char c : str2.toCharArray()) {
            freq2[c - 'a']++;
        }

        int deletions = 0;

        
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(freq1[i] - freq2[i]);
        }

        return deletions;
    }

    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
//        String str1 = "bcadeh";
//        String str2 = "hea";
    	String str1 =sc.next();
    	String str2=sc.next();

        int deletions = minDeletionsToMakeAnagram(str1, str2);

        System.out.println("Minimum deletions to make anagrams: " + deletions);
    }
}
