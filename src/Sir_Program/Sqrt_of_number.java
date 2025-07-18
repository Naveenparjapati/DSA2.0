package Sir_Program;

public class Sqrt_of_number {

    public static int sqrtnum(int n)
    {
        if(n<0){
            return n;
        }
        int si=0;
        int end=n/2;
        while (si<=end)
        {
            int mid=end+(si-end)/2;
            long squore=(long)mid*mid ;
            if(squore==n)
            {
                return mid;
            } else if (squore<n) {
                si=mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int n=8;//2
      int res=  sqrtnum(n);
      System.out.print("sqrt of "+n+" is "+res);
    }
}

//
//Example 1:
//
//Input: x = 4
//Output: 2
//
//Example 2:
//
//Input: x = 8
//Output: 2