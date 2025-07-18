package Sir_Program;

public class number_to_sqrt {

    public static void main(String[] args) {
        int number = 8;
        int sqrt = 1;

        while (sqrt * sqrt <= number) {
           
            sqrt++;
        }

        System.out.println("Square root of " + number + " is: " + --sqrt);
    }
}
