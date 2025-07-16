package Sir_Program;

public class ArrayBordersum {
	public static void main(String[] args)
	   { 
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int row=arr.length;
		int col=arr[0].length;
		int sum=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			    if(i==0||j==0||i==row-1||j==col-1)
			    {
			    	sum +=arr[i][j];
			    }
			}
		}
		System.out.print(sum);
	   }
}
