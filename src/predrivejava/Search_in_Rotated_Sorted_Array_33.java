package predrivejava;

public class Search_in_Rotated_Sorted_Array_33 {
public static int 	search(int[] arr,int target)
	{
		int left=0,right=arr.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			if(target==arr[mid])
			{
				return mid;
			}
			
			if(arr[left]<=arr[mid])
			{
				if(arr[left]<=target && target<arr[mid])
				{
					right=mid-1;
				}else {
					left=mid+1;
				}
				
			}else {
				if(target<=arr[right] && target<arr[mid])
				{
					right=mid+1;
				}else {
					left=mid-1;
				}
			}
			
		}
		return -1;
	}
	
public static void main(String[] args)
{
	 int[] nums = {4, 5, 6, 7, 0, 1, 2};
     int target1 = 0;
     int target2 = 3;

     System.out.println(search(nums, target1)); // Output: 4
     System.out.println(search(nums, target2)); // Output: -1
}
}
