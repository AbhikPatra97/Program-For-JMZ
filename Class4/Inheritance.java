package Class4;


class A {
	void test() {
		System.out.println("test A");
	}
	void test1() {
		System.out.println("test1 A");
	}
}
class B extends A{
	void test3() {
		System.out.println("test3 B");
	}
	void test1() {
		System.out.println("test1 B");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.test();
		a.test1();
		
		B b=new B();
		b.test();
		b.test1();
		b.test3();
		
		A a1=new B();
		a1.test();
		a1.test1();
		//a1.test3();
		
	}

}
