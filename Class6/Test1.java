package Class6;

public class Test1 {
	String s;
	String s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 a=new Test1();
		a.s="Hello";
		Test1 a1=new Test1();
		a1.s="Kool";
		Test1 a2=new Test1();
		
		Test1[] arr= {a,a1};
		for(Test1 K:arr) {
			if(validate(k)) {
				System.out.println(a1.s);
			}
		}
	}
	static boolean validate( k) {
		if(a1.s==null)
			return false;
		else
			return true;
	}

}
