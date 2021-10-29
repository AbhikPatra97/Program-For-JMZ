package Class7_OOPS;

public class StaticTest {
	 int j=0;
	 static int i=0;
	StaticTest(){
		i++;
		j++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticTest();	//i=0 -> 1 		//j=0 -> 1 
		new StaticTest();	//i=1 -> 2		//j=0 -> 1 
		
		System.out.println(new StaticTest().i);	//i=2 -> 3
		System.out.println(StaticTest.i);
		
		System.out.println(new StaticTest().j); //j=0 -> 1 
	//	System.out.println(StaticTest.j);
	}

}
