package predrivejava;
import java.util.*;
public class EvenAndoddelementshifting {
//shifting even left or odd element left side

public static void shifting(int[] arr)
{
  int evenIndex=0;
  
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]%2==0)
    {
      int temp=arr[i];
      arr[i]=arr[evenIndex];
      arr[evenIndex]=temp;
      
      evenIndex++;
    }
  }
}


  public static void main(String[] args)
  {
    int[] arr={3,1,2,4,7,6,9,8};
    shifting(arr);
    System.out.println(Arrays.toString(arr));
}
}
