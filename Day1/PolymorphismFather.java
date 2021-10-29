package Day1;
class Son{
	 void father() {
		System.out.println("Acts fatherly...");
	}

}
class Mother extends Son{
	 void father() {
		System.out.println("Acts as a husband...");
	}

}
class School extends Mother{
	 void father() {
		System.out.println("Acts as a teacher...");
	}

}

public class PolymorphismFather {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School a=new School();
		a.father();
		
	}

}
