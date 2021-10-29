package Class91_File;

class A{
	static String s=" ";
	protected A() {
		s+="alpha";
	}
}

class B extends A{
	private B() {
		s+="sub";
	}
}

public class OopsDemo1 extends A {
	private OopsDemo1() {
		s+="subsub1";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OopsDemo1();
		System.out.println(s);
	}

}
