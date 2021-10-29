package Class9_File;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("java.txt");
		try {
			f.createNewFile();
			File f1=new File("D:\\Program\\JMZ Technology\\java1.txt");
			if(f1.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File exist");
			}
			if(f1.exists()) {
				System.out.println("File exists");
			}
			else {
				System.out.println("File crested");
			}
		}
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
