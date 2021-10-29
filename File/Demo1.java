package File;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.mkdir());
		
	}

}
