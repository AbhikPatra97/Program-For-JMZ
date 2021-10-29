package Day1;

import java.util.Scanner;

public class PrimeNumber {
	static void checkprime(int n) {
		int m=n/2;
		int flag=0;
		
		if(n==0||n==1) {
			System.out.println(n + " is not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n + " is not a prime number");
					flag=1;
					break;
				}				
			}
			if(flag==0) {
				System.out.println(n + " is a prime number");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int i=scn.nextInt();
		checkprime(i);
	}

}
