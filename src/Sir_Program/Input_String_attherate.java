package Sir_Program;
//	Input: String s=”1-2,3-4,@,5-6,7-8”;   output:[[[1,2],[3,4]],[[5,6],[7,8]]];
import java.util.ArrayList;
import java.util.List;
public class Input_String_attherate {

    public static void main(String[] args) {
        String s = "1-2,3-4,@,5-6,7-8";

        // Process the string and get the desired output
        List<List<List<Integer>>> result = processString(s);

        // Print the output
        System.out.println(result);
    }

    // Function to process the input string and generate the desired output
    public static List<List<List<Integer>>> processString(String s) {
        List<List<List<Integer>>> outerList = new ArrayList<>();

        // Split the string by commas to get individual segments
        String[] segments = s.split(",");

        // Temporary list to hold pairs of integers
        List<List<Integer>> innerList = null;

        // Iterate over the segments and process each one
        for (String segment : segments) {
            // Skip the '@' symbol
            if (segment.equals("@")) {
                continue;
            }

            // Split the segment by hyphen to get pairs of numbers
            String[] pairStrings = segment.split("-");

            // Convert the split segments to integers and add to the inner list
            List<Integer> pair = new ArrayList<>();
            for (String num : pairStrings) {
                pair.add(Integer.parseInt(num));
            }

            // If innerList is null, create a new inner list
            if (innerList == null) {
                innerList = new ArrayList<>();
            }

            // Add the pair to the inner list
            innerList.add(pair);

            // If we already have two pairs in the inner list, add the inner list to the outer list
            if (innerList.size() == 2) {
                outerList.add(innerList);
                innerList = null;  // Reset the inner list for the next set of pairs
            }
        }

        return outerList;
    }
}
