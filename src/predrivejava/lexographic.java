package predrivejava;
import java.util.*;
//lexographic order shorting


public class lexographic {

public static void lexoGraphicSorting(String[] arr)
{
  for(int i=0;i<arr.length;i++)
  {
    for(int j=0;j<arr.length-1-i;j++)
    {
      if(arr[j].compareTo(arr[j+1])>0)
      {
        String temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
}


  public static void main(String[] args) {
    String[] arr={"a","d","b","c"};
    lexoGraphicSorting(arr);
    System.out.println(Arrays.toString(arr));
}
}