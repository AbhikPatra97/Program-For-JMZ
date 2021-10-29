package Day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a +" "+ b);
		int sum=0;
		
		while(sum<100) {
			sum=a+b;
			System.out.print(" "+ sum);
			a=b;
			b=sum;
		}
	}

}
