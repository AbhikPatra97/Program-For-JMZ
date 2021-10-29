package Class93_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import Class6.Employee;
import Class92_Exception.Demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		System.out.println(l.add("abhik"));
		System.out.println(l.add("patra"));
		System.out.println(l.add(new Demo())); // output : address
		System.out.println();
		System.out.println(l);
		System.out.println();
		for(Object o:l) {
			System.out.println(o);
		}
		System.out.println();
		System.out.println(l.size());
		
		l.set(1,5);
		System.out.println();
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		/*
		System.out.println("______________________________________");
		l.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object t) {

				System.out.println(t);
			}
		});
		*/
		System.out.println("---------------------");
		l.forEach((Object name) -> System.out.println(name));
		System.out.println("---------------------");
		l.forEach(name -> System.out.println(name));
	}

}
