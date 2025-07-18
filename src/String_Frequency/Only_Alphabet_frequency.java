package String_Frequency;

public class Only_Alphabet_frequency {
	public static void main(String[] args) {
        String str = "hello&&&java";
        int[] arr=new int[127];
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
        	arr[ch]++;
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>0)
        	{
        		System.out.println((char)i+" "+arr[i]);
        	}
        }

 }
}
