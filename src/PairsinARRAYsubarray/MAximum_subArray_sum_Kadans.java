package PairsinARRAYsubarray;
//we can take - nag value also 
public class MAximum_subArray_sum_Kadans {
	public static void kadans(int[] number)
	{
		int ms=Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<number.length;i++)
		{
			cs=cs+number[i];
			if(cs<0)
			{
				cs=0;
			}
			ms=Math.max(cs, ms);
		}
		
		System.out.print("Maximim sum is "+ms);//Maximim sum is 7
	}
	
	
	public static void main(String[] args)
	   {
		  int[] arr= {-2,-2,4,-1,-2,1,5,-3};
		  kadans(arr);
	   }
	
}
