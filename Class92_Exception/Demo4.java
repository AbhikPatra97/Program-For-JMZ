package Class92_Exception;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
			System.out.println("Ending");
			return;
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
