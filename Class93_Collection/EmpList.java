package Class93_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> e=new ArrayList<Emp>();
		Emp e1=new Emp(11,"First");
		Emp e2=new Emp(44,"Second");
		Emp e3=new Emp(22,"Third");
		e.add(e1);
		e.add(e2);
		e.add(e3);
		System.out.println(e);
		System.out.println("After Sorting :::::::--------");
    	Collections.sort(e);
    	System.out.println(e);
	}
	
}
