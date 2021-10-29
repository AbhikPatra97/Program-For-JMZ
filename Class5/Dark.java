package Class5;

public class Dark {
	int x=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Dark().go1().x);
	}
	Dark go1() {
    	int x=1;
		go2(++x);
	//	System.out.println(x);
		return new Dark();
	}
	void go2(int y) {
		int x=++y;
		System.out.println(x);
	}

}
