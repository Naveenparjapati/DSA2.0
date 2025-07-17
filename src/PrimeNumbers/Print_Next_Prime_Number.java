package PrimeNumbers;

public class Print_Next_Prime_Number {


	public static void PrimrOrNot()
	{
		int nP=3;
		for(int K=nP+1;K<=100;K++) {
			int n=K;
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
			System.out.println("n is prime "+n);
			break;
		}
	}
	}
   public static void main(String[] args)
   {
	     
	     PrimrOrNot();
   }
}
