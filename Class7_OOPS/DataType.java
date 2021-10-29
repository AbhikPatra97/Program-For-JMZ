package Class7_OOPS;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i=10000000000;	// upto 9 digits are allowed in "int".
		System.out.println(i);
		*/
		long j=1000000000000000l;
		System.out.println(j);
		int k=(int)j;				// Narrowing
		System.out.println(k);
		int l=(int)1000000000;		// Narrowing
		System.out.println(l);
		
		int i=1000000000;
		long z=i;
		System.out.println(z);
	}

}
