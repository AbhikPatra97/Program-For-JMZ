package Class8;
class A1{
	int i=10; 
}
class B1 extends A1{
	void test1() {
		System.out.println("Test 1");
	}
}
class C1 extends B1{
	void tets1() {
		i=20;				//but if we write the i outside the method it will not work
		System.out.println("Test 1 C");
	}
}
public class Reinitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		System.out.println(a.i);
		a.i=100;
		System.out.println(a.i);
		
		A1 a1=new B1();
		a1.test1();
	}

}
