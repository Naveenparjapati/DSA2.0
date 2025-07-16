package PairsinARRAYsubarray;

public class Continous_pairs_of_Array {
	
	public static void ContinousPairs(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int Start=i;
			for(int j=i;j<arr.length;j++)
			{
				int end=j;
				for(int k=Start;k<=end;k++)
				{
				System.out.print(arr[k]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	   {
		int[] number={2,4,6,8,10};
		  ContinousPairs(number);		
		}
	   }
	
//2 2 4 2 4 6 2 4 6 8 2 4 6 8 10 
//4 4 6 4 6 8 4 6 8 10 
//6 6 8 6 8 10 
//8 8 10 
//10 
