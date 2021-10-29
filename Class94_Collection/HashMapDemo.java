package Class94_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put("1", "one");
		m.put("2",20);
		m.put(null,"null");
		System.out.println(m);
	//	m.put("null",null);		// this is String null and others ones are normal null. Thats why we are getting two null as Output
		m.put(null,"Ok");
		m.put("2",200);
		m.put(null,null);
		m.put("3",20);
		System.out.println(m);
	}

}
