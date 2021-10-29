package Class9_File;

public class EmployeeFile {
	private int empid;
	private String empName;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeFile [empid=" + empid + ", empName=" + empName + "]";
	}
	

}
