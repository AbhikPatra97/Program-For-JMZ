package File;

import java.io.File;
import java.io.IOException;

public class Demo2_CreateNewFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abhik");
		f.mkdir();
		File f1=new File(f,"abc.txt");
		f1.createNewFile();
	}

}
