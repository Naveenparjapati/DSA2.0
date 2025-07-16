package PairsinARRAYsubarray;

public class Pairs_in_Array {
	public static void PrintPairs(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print("("+current+","+arr[j]+")");
			}
			System.out.println();
		}
	}
	
  public static void main(String[] args)
  {
	  int[] number={2,4,6,8,10};
	  PrintPairs(number);
  }

}
//(2,4)(2,6)(2,8)(2,10)
//(4,6)(4,8)(4,10)
//(6,8)(6,10)
//(8,10)
