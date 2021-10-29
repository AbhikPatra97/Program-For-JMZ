package Class8;

class B{
	static int i;
	static void test(){
		
	}
}

public class TwoClass {
	B b; 		// here passing 10 integer value but here we have class type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoClass a=new TwoClass();
		System.out.println(a.b.test(););
		System.out.println(a.b.i);
	}

}
