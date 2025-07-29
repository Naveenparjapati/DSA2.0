package String_Frequency;


import java.util.Arrays;

class frequencywithoutmapdifrentway {
    public static void checkAlmostEquivalent(String word1, String word2) {
      
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        
        for (char c : word1.toCharArray()) 
        {
            freq1[c - 'a']++;
        }

       
        for (char c : word2.toCharArray()) 
        {
            freq2[c - 'a']++;
        }

       
       for(int i:freq1)
       {
         System.out.print(i);
       }
       
        System.out.println();
        
       for(int k:freq2)
       {
         System.out.print(k);
       }

       
    }

    public static void main(String[] args)
    {
      
        
       
      checkAlmostEquivalent("aaaa", "bccb");
       
    }
}