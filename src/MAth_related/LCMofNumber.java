package MAth_related;

public class LCMofNumber {
	
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

public static int lcmo(int x,int y)	
{
	if(x==0||y==0)
	{
		return 0;
	}
	return Math.abs(x*y/gcdof(x,y));
}
	
public static void main(String[] args)
{
	System.out.print(lcmo(19,20));
}
}
