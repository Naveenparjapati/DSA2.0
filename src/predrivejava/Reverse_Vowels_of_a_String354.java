package predrivejava;

public class Reverse_Vowels_of_a_String354 {
 public static  boolean isVowel(char ch){
    ch =  Character.toLowerCase(ch);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        return true;
    }
    return false;
    }
    
  public static String reverseVowels(String s) 
  {
         char[] ch=s.toCharArray();
         int start=0;
         int end=ch.length-1;
         while(start<end)
         {
              if(!isVowel(ch[start]))
              {
                start++;
            }
           else if(!isVowel(ch[end]))
            {
                end--;
            }else{
              char temp=ch[start];
              ch[start]=ch[end];
              ch[end]=temp;
              
              start++;
              end--;
            }
         }
         return new String(ch);
    }
    public static void main(String[] args) {
      String s="leetcode";
      System.out.println(reverseVowels(s));
  }
}