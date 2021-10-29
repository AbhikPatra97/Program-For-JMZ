package Class91_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		System.out.println(e);
		
		//save the state of object in file using serialization
		FileOutputStream fout=new FileOutputStream("emp.ser");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(e);
		
		// read Serialized object state from file
		FileInputStream fin=new FileInputStream("emp.ser");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee e1=(Employee)oin.readObject();
		System.out.println(e1);
	}

}
