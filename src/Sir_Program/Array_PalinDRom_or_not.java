package Sir_Program;

public class Array_PalinDRom_or_not {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};  // Change the array to test others

        boolean isPalindrome = true;
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }
}
