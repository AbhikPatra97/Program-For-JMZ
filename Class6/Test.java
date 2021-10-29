package Class6;

class A{
	void test() {
		System.out.println("test A");
	}
}

class B extends A{
	void test() {
		System.out.println("test B");
	}
}

class C extends B{
	void test() {
		System.out.println("test C");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	A[] a = {new A(),new B(),new C()};
		for(A a1:a) {
			a1.test();
		}
		*/
		A a =new A();
		B b =new B();
		C c =new C();
		Z.print(a);
		Z.print(b);
		Z.print(c);
	}
/*
	static void print(A a) {
		a.test();
	}
*/
}
class Z{
	static void print(A a) {
		a.test();
	}
}
	