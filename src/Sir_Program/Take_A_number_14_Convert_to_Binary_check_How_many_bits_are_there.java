package Sir_Program;

public class Take_A_number_14_Convert_to_Binary_check_How_many_bits_are_there {

    public static void main(String[] args) {
        int number = 14;  // The number to convert
        String binaryString = Integer.toBinaryString(number);  // Convert to binary string
        
        // Count the number of bits (length of the binary string)
        int bitCount = binaryString.length();
        
        // Output the results
        System.out.println("Binary representation of " + number + ": " + binaryString);
        System.out.println("Number of bits in the binary representation: " + bitCount);
    }
}
