package Class92_Exception;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
			try {
				int j=100/0;
				}
			catch(Exception e) {
				System.out.println("Can't be devide");
				}
			}
		catch(Exception e) {
			System.out.println("Can't be devide last");
		}
	}

}
