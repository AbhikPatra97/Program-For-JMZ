package Class7_OOPS;

class Car{
	void milage() {
		System.out.println("Car milage");
	}
}
class BMW extends Car{
	
}
class Tesla extends Car{
	void muilage() {
		System.out.println("Tesla Milage");
	}
	Electricity electric;	// electric is Electricity type, and the value is null.
}
class Electricity{
	void test() {
		System.out.println("Electronic");
	}
}
public class IS_aHAS_a_Relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla t=new Tesla();
		t.electric.test(); //we are calling test() using electric reference which is null
	}

}
