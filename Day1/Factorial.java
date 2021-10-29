package Day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		
		int fact=1;
		if(n==0) {
			System.out.println("Factorial of "+n+" is "+fact);
		}
		else {
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}

	}

}
