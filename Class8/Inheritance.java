package Class8;

class A{
	void test1() {
	//	System.out.println("Test A");
	}
}
class D extends A{
	void test1() {
		System.out.println("Test B");
	}
}
class C extends A{
	void test1() {
		System.out.println("Test C");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new D();
		a.test1();
		A a1=new C();
		a1.test1();
	}

}
