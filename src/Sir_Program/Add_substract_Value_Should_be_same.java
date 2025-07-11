package Sir_Program;

public class Add_substract_Value_Should_be_same {

    public static void main(String[] args) {
        int originalValue = 10;  // Starting value (can be any integer)
        int valueToAddAndSubtract = 5;  // Value to add and subtract
        
        // Perform addition
        int afterAddition = originalValue + valueToAddAndSubtract;
        
        // Perform subtraction
        int finalResult = afterAddition - valueToAddAndSubtract;
        
        // Output the final result, it should be same as original value
        System.out.println("Original Value: " + originalValue);
        System.out.println("After Addition and Subtraction: " + finalResult);
    }
}
