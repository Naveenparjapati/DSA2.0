package PrimeNumbers;

public class CheckPrimeOrNot {
	public static void PrimrOrNot(int n)
	{
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.print("n is prime "+n);
		}else {
			System.out.print("n not a prime "+n);
		}
	}
   public static void main(String[] args)
   {
	     int n=30;
	     PrimrOrNot(n);
   }
}
