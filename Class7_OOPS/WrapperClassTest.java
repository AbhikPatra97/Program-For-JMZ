package Class7_OOPS;
// Boxing
public class WrapperClassTest {

	boolean go(Integer i) {
		Boolean check=true;
		short s=300;
		if(check) {
			System.out.println(++s);
		}
		return !check;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClassTest t=new WrapperClassTest();
		System.out.println(t.go(5));
	}

}
