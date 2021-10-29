package Class93_Collection;

public class Emp implements Comparable<Emp>{
	int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	String name;
	@Override
	public String toString() {
		return "Emp [emoId=" + empId + ", name=" + name + "]";
	}
	public int getEmoId() {
		return empId;
	}
	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public void setEmoId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
	//	return this.empId - o.empId;  		// to make it reverse :: return  o.empId -this.empId;
		return this.name.compareTo(o.name); // to make it reverse :: return o.name.compareTo(this.name);
	}
	
}
