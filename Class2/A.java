package Class2;

class A {
	int i;
	int j;
	
	A(int i){
		this(2,3);
		this.i=i;
		System.out.println(i);
	//	this(2,3);	//this Statement must be written at the binging 
	}
	
	A(int i,int j){
		this.i=i;
		System.out.println(i);
		this.j=j;
		System.out.println(j);
	}
	
	static void m1() {
		System.out.println(25);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(10);
		
		m1();
		
	/*	A b = new A(1,2);
		System.out.println(b.i);
		System.out.println(b.j); */
	}

}
