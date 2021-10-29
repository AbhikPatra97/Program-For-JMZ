package Class3;

class B{
	static void test() {
		System.out.println("B test ");
	}
	
}

public class InheritanceCheck extends B {
	
	    static void test() {
		System.out.println("Inheritance test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceCheck b=new InheritanceCheck();
		b.test();
	}

}

