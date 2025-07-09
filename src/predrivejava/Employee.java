
package predrivejava;
	public class Employee {
	    private String firstName;
	    private String lastName;
	    private String ssn;

	    // Default constructor
	    public Employee() {
	        this.firstName = null;
	        this.lastName = null;
	        this.ssn = null;
	    }

	    // Parameterized constructor
	    public Employee(String firstName, String lastName, String ssn) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.ssn = ssn;
	    }

	    // Method to validate name
	    public String validateName(String firstName, String lastName) {
	        if (firstName != null && lastName != null) {
	            return "Valid String";
	        } else {
	            return "Invalid String";
	        }
	    }

	    // Method to validate SSN
	    public String validateSsn(String ssn) {
	        if (ssn != null && ssn.length() >= 2) {
	            if (Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(ssn.length() - 1))) {
	                return "Valid String";
	            }
	        }
	        return "Invalid String";
	    }

	    // Getters and Setters (optional, if needed)
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getSsn() {
	        return ssn;
	    }

	    public void setSsn(String ssn) {
	        this.ssn = ssn;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Employee emp = new Employee("John", "Doe", "123-45-6789");
	        
	        System.out.println(emp.validateName(emp.getFirstName(), emp.getLastName())); // Valid String
	        System.out.println(emp.validateSsn(emp.getSsn())); // Valid String
	        
	        Employee emp2 = new Employee(null, "Smith", null);
	        
	        System.out.println(emp2.validateName(emp2.getFirstName(), emp2.getLastName())); // Invalid String
	        System.out.println(emp2.validateSsn(emp2.getSsn())); // Invalid String
	    }
	}

//🔶 Question 1 Title:
//Implement Validation Methods for Name and SSN in Java
//
//🔷 Problem Statement:
//You are required to create a class Employee with private fields:
//
//String firstName
//
//String lastName
//
//String ssn (Social Security Number)
//
//🔹 Constructors:
//
//Default constructor (sets all fields to null)
//
//Parameterized constructor (accepts and sets all 3 fields)
//
//🔹 Methods to Implement:
//
//String validateName(String firstName, String lastName)
//
//Return "Valid String" if both are not null.
//
//Else, return "Invalid String"
//
//String validateSsn(String ssn)
//
//Return "Valid String" if first and last characters of ssn are digits (use Character.isDigit()).
//
//Else, return "Invalid String"
