package Class7_OOPS;

public class ReferenceVariable_Final {
	int empId;
	String empName;
	public ReferenceVariable_Final(int i, String string) {
		// TODO Auto-generated constructor stub
		this.empId=i;
		this.empName=string;
	}
	@Override
	public String toString() {
		return "ReferenceVariable_Final [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
