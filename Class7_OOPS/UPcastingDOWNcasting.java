package Class7_OOPS;
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

public class UPcastingDOWNcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		A a1=new B();
		A a2=new C();
		
		B b=new B();
		B b1=new C();
		
		C c=new A();			// Direct down-casting is not possible 		//class-cast exception
		C c1=(C)new B();		//Only up-casted object can be down-casted
		B b2=(B)new A();
		
	}

}
