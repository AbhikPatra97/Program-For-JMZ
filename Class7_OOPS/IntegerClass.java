package Class7_OOPS;

public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer y=new Integer(567);
		int i=y;
		i++;
		System.out.println(i);
		y = new Integer(123);
		y++;
		System.out.println(y);
		
		Integer i1=10;
		Integer i2=10;
		if(i1==i2) {
			System.out.println(i1.equals(i2));
		}
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
