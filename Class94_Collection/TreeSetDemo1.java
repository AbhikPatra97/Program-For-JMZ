package Class94_Collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet s=new TreeSet();
		s.add(10);
		s.add(15);
		s.add(20);
		s.add(27);
		System.out.println(s);
		System.out.println(s.ceiling(16));
		System.out.println(s.ceiling(10));
		System.out.println(s.floor(13));
		System.out.println(s.floor(20));
	}

}
