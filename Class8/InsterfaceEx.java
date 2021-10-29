package Class8;

interface I1{
	void test3();
	void test4();
	
}
abstract class K implements I1{
	
}
 class L extends K{
	public void test3() {
		System.out.println("Test3 B");
	}
	public void test4() {
		System.out.println("Test4 B");
	}
}

public class InsterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i=new L();
		i.test3();
		i.test4();
	}

}
