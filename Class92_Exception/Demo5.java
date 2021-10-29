package Class92_Exception;

import java.io.File;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("Class92_Demo5.txt");
			try {
				int i=10/0;
			}
			finally {
				System.out.println("Inner try");
			}
		}
		finally{
			System.out.println("Finally");
		}

	}

}
