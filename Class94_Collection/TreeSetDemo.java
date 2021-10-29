package Class94_Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet s=new TreeSet();
		s.add("10");
		s.add("Hello");
		s.add("K");
		s.add("kool");
		s.add("Abhik");
		s.add("Patra");
		s.add("a");
		s.add("c");
		s.add("b");
		s.add("A");
		s.add("l");

		System.out.println(s);
		System.out.println(s.pollFirst());
		System.out.println(s);
		System.out.println(s.pollLast());
		System.out.println(s);
		System.out.println(s.ceiling("a"));
	}

}
