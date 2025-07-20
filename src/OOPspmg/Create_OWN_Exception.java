package OOPspmg;



//✅ Custom exception should extend Exception
class MoneyException extends Exception {
 public MoneyException(String message) {
     super(message);
 }
}

public class Create_OWN_Exception {
 static double Balance = 500000;

 public static void main(String[] args) {
     try {
         amount(600000);
     } catch (MoneyException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }

 private static void amount(int userAmount) throws MoneyException {
     if (userAmount <= Balance) {
         System.out.println("Enjoy your withdrawal!");
     } else {
         throw new MoneyException("Insufficient Balance! Requested: " + userAmount + ", Available: " + Balance);
     }
 }
}
