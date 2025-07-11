package Sir_Program;
import java.util.*;

public class ArrayNegitive_left_positive_right {

    public static void main(String[] args) {
        int[] input = { -12, -11, -5, -7, -9, 6, -1, 5 };

        rearrangeArray(input);

        System.out.println("Output: " + Arrays.toString(input));
    }

    public static void rearrangeArray(int[] arr) {
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();

        // Separate into negative and positive lists
        for (int num : arr) {
            if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }
        }

        // Combine them back into the array
        int index = 0;
        for (int num : negative) {
            arr[index++] = num;
        }
        for (int num : positive) {
            arr[index++] = num;
        }
    }
}
