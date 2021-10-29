package Class9_File;

abstract class A{
	A(){
		
	}
	void test() {
		System.out.println("Test");
	}
	void test1() {
		
	}
}

public class Demo extends A{
	void test() {
		System.out.println("Demo Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new Demo();
		a.test();
		a.test1();
	}

}
