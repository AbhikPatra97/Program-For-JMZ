package Class9_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		EmployeeFile e=new EmployeeFile();
		e.setEmpid(1);
		e.setEmpName("Abhik");
		
		File f=new File("EmployeeFile");
		
		BufferedWriter bw=new BufferedWriter(new PrintWriter(f));
		bw.write(e.toString());
		bw.close();
		System.out.println("Done ");
	}

}
