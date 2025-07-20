package Sir_Program;

public class Power_of_number2
{
    public static void main(String[] args) 
    {
        int base = 2;
        int exponent = 3;
        long result = 1;

        for (int i = 0; i < exponent; i++)
        {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result); // Output: 2 raised to the power of 3 is 8
    }
}