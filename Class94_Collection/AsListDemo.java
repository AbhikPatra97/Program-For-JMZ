package Class94_Collection;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"one","second","third","four"};
		List l =Arrays.asList(s);	// we are converting the String Array to List
		System.out.println(l);
		System.out.println();
		
		l.set(1,"on");
		System.out.println(l);
		System.out.println("--__--__--__");
		System.out.println();
		for(String i:s) {
			System.out.print(i+" ");
		}
		s[0]="Zero";
		System.out.print("============");
		System.out.println();
		for(String i:s) {
			System.out.print(i+" ");
		}
		System.out.println("----------");
		System.out.println();
		for(String s1:s) {
			System.out.print(s1+" ");
		}
		System.out.println("__________");
		System.out.println(l);
	}

}
