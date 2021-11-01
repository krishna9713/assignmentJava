package ArithmeticOperators;

public class MethodPrintEqual3Parameters {

	public static void printEqual(int fNumber, int sNumber, int tNumber) {
		  
	    if (fNumber < 0 || sNumber < 0 || tNumber < 0) {
	    
	      System.out.println("Invalid Value");
	    
	    }
	    else if (fNumber == sNumber && fNumber == tNumber && sNumber == tNumber) {
	    
	      System.out.println("All numbers are equal");
	    
	    }
	    else if (fNumber != sNumber && fNumber != tNumber && sNumber != tNumber) {
	    
	      System.out.println("All numbers are different");
	    
	    }
	    else {
	    
	      System.out.println("Neither all are equal or different");
	    
	    }
	  
	  }

	}
	


