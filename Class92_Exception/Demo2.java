package Class92_Exception;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
		}
		
/*		catch(Exception e ) {					//We can't write the super class(Exception) because if all the Exception handled here  
			System.out.println("Exception");	//	what is the use of ArithmaticException after handling everything. That's why we can have Super Class(Exception) at the end.
		}
	*/	
		catch(ArithmeticException e1) {
			System.out.println("Arithmatic Exception");
		}
		
		catch(Exception e ) {
			System.out.println("Exception");
		}
	}

}
