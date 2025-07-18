package predrivejava;

public class Uppercase_to_Lowercase {

	    public static void main(String[] args) {
	        String input = "HELLo JAVA";
	        String result = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char)(ch + 32); // Convert to lowercase
	            }

	            result += ch;
	        }

	        System.out.println("Lowercase: " + result);
	    }
	}


