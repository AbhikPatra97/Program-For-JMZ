package Class9_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("FileEx3.txt");
		f.createNewFile();
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		String data=br.readLine();
		
		System.out.println(data);
		
		String a=null;
		
		a=br.readLine();
		while(a!=null) {
			System.out.println(a);
			a=br.readLine();
		}
	}

}
