package Day1Assignment1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest t1=new StringTest();
		StringTest t2=new StringTest();
		if(!t1.equals(t2)) {
			System.out.println("They're not equal");
		}
		if(t1 instanceof Object) {
			System.out.println("t1's an Object");
		}
	}

}
