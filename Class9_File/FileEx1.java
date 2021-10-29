package Class9_File;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("D:\\Program\\JMZ Technology\\test.txt");
		try {
			PrintWriter fw=new PrintWriter(f);
			Console c=new Console();
			fw.write("hello");
		//	fw.newLine();
			fw.write("World");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
