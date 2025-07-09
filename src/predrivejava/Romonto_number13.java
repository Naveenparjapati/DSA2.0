package predrivejava;

public class Romonto_number13 {
public static void main(String[] args)
{
	String str="VVV";
	int no=0,prev=0,sum=0;
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		switch(ch)
		{
		case 'I':no=1;break;
		case 'V':no=5;break;
		case 'X':no=10;break;
		case 'L':no=50;break;
		case 'C':no=100;break;
		}
		
		if(no < prev)
		{
			sum -=no;
		}else {
			sum +=no;
		}
		
		prev=no;
	}
	System.out.print(sum);
}
}
