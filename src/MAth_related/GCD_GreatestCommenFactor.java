package MAth_related;

public class GCD_GreatestCommenFactor {
	
	
public static int gcdof(int a,int b)
{
	if(b!=0)
	{
		int temp=b;
		b=a%b;
		a=temp;
	}
	return a;
}
	
	
public static void main(String[] args)
{
	System.out.print(gcdof(10,20));
}
}
