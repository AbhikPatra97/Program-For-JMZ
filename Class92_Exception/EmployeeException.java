package Class92_Exception;

public class EmployeeException extends Exception {
	EmployeeException(String msg){
		super(msg);
	}
	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		throw new EmployeeException("Under aged");

	}

}
