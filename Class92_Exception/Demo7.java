package Class92_Exception;

public class Demo7 {
	static String s=" ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			s+="1";
			throw new Exception();
		}
		catch(Exception e) {
			s+="2";
		}
		finally {
			s+="3";
			dostuff();
			s+="4";
		}
		System.out.println(s);
	}
	static void dostuff() {
		int x=0;
		int y=7/x;
	}

}
