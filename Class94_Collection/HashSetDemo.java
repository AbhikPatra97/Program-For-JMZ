package Class94_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add(10);
		s.add("20");
		s.add(true);
		s.add('A');
		s.add(10);
		Set s1=new LinkedHashSet(s);
		s1.add("10");
		s1.add("Hello");
		
		
		for(Object i:s1) {
			System.out.println(i);
		}
		System.out.println("_________");
		System.out.println(s1);
	}

}
