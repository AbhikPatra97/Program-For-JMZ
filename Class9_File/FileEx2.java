package Class9_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] data=new char[20];
		File f=new File("FileEx2.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("ab\n");
		fw.write("Pr");
		fw.close();
		
		
		FileReader fr=new FileReader(f);
		int size=fr.read(data);
		System.out.println(size);
		for(char c:data) {
			System.out.print(c);
		}

	}

}
