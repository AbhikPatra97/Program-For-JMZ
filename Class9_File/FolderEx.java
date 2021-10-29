package Class9_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FolderEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("D:\\Program\\JMZ Technology\\FJava");
		PrintWriter pw=new PrintWriter(f);
		pw.println("test");
		pw.println("test 1");
		pw.flush();
		pw.close();
	}

}
