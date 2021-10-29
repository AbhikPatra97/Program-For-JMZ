package Class7_OOPS;

public class EMP_ToString_Test {
	
	private int empId;
	private String empName;
	
	EMP_ToString_Test(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMP_ToString_Test e=new EMP_ToString_Test(11,"Abhik");
		System.out.println(e);
		EMP_ToString_Test e1=new EMP_ToString_Test(12,"Patra");
		System.out.println(e1);
	}
	
	public String toString() {
		return "empId:  " +empId+" empName:  " +empName;
	}

}
