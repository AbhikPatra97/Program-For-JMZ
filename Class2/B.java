package Class2;

public class B {
	
	B(){
		this(10);
		System.out.println("a");
	}
	B(int i){
		this();
		System.out.println("b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(10);
	}

}
