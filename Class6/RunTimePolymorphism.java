package Class6;

class RBI{
	void interest() {
		System.out.println("RBI : rate of interest is 8%");
	}
}

class SBI extends RBI{
	void interest() {
		System.out.println("SBI : rate of interest is 10%");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI a =new SBI();
		a.interest();
	}

}
