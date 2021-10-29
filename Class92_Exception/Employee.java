package Class92_Exception;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		try {
			if(age<18) throw new Exception("Under age");
			else
				System.out.println("Qualified");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
