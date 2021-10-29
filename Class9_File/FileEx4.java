package Class9_File;

import java.io.File;
import java.io.IOException;

public class FileEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\Program\\JMZ_Technology");
		/*
		String[] fileList=f.list();
		for(String i:fileList) {
			System.out.println(i);
			 
		}
		*/
		 File[] f1=f.listFiles();
		 for(File f2:f1) {
				System.out.println(f2);
				}
		 }
	}
