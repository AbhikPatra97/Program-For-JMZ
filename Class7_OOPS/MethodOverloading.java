package Class7_OOPS;

public class MethodOverloading {
	int i=10;
	void dtest(int i) {
		System.out.println("D int i");
	}
	void dtest(Integer i) {
		System.out.println("D Integer i");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading a= new MethodOverloading();
		a.dtest(10);
	}

}
