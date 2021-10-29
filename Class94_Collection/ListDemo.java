package Class94_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add("hello");
		l.add("h");
		l.add("kool");
		l.add("H");
		l.add("ok");
		l.add("a");
		l.add("A");
		l.add("abc");
	//	l.add(10);
		System.out.println(l);
		Collections.sort(l);		// sort will not happen on multi-type of data
		System.out.println(l);
	}

}
