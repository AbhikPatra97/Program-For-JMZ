package Class2;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello";
		System.out.println(s.indexOf('k'));
		System.out.println(s.length());
		String s1=new String("kool ");
		s=s1;
		s=s+s1;
		s="Ok ";
		s1=s1+s;
		s="fine "+s1;
		System.out.println(s);
		System.out.println(s1);
	}

}
