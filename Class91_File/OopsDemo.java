package Class91_File;

class Top{
	public Top() {
		System.out.println("B");
	}
}

public class OopsDemo extends Top{
	public OopsDemo(String s) {
	//	super(s);
		System.out.println("D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OopsDemo("C");
		System.out.println("k");
	}

}
