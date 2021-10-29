package Class92_Exception;

class A{
	void test1() throws Exception {
		test2();
		
	}
	void test2() throws Exception {
		test3();
	}
	void test3() throws Exception {
		int i=0;
		int out=i/0;
	}
}
public class Demo {
	public static void main(String[] args) {
		A a=new A();
		try {
			a.test1();
		}
		catch(Exception e) {
			System.out.println("Can't be done");
		}
		
	}
}
