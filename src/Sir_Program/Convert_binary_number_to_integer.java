package Sir_Program;

public class Convert_binary_number_to_integer {

    public static void main(String[] args) {
        String binaryString = "1101";  // Example binary number
        int integerValue = Integer.parseInt(binaryString, 2);  // Convert binary string to integer
        System.out.println("Binary number " + binaryString + " as integer: " + integerValue);
    }
}
