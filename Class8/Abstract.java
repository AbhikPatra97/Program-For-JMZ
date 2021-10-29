package Class8;

abstract class X{
	abstract void test1(); 
	void test2() {
		System.out.println("Test2 X");
	}
}
abstract class Y extends X{
	
}
class Z extends X{
	void test1() {
		System.out.println("Test Z");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X a =new Y();
		a.test1();
		X a1=new Z();
		a1.test1();
		
		a.test2();
		a1.test2();
	}

}
