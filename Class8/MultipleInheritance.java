package Class8;

interface I3{
	int i = 10;
	int j=i;
	int k=10;
	public abstract void test1();
	
}
interface I4 extends I3{
	abstract void test2();
	
}
class E implements I3,I4{
	public void test1() {
		System.out.println("Test1 E");
	}
	public void test2() {
		System.out.println("Test2 E");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e=new E();
		e.test1();
		e.test2();
		System.out.println(I3.i);
		System.out.println(E.i);
		System.out.println(I3.j);
	}

}
