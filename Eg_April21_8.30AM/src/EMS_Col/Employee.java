package EMS_Col;

import java.util.Date;

public class Employee {
	private String  empId;
	private String empName;
	private Date dateOfJoining;
	private float basicSal;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		int size = empId.length();
		if(size == 4)
		this.empId = empId;
		else
			throw new InvalidDataException("Emp Id should contain 4 digits but found : "+size );
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		if(basicSal >= 5000)
		this.basicSal = basicSal;
		else
			throw new InvalidDataException("Emp Basic salary should not lessthan 5000 but found "+ basicSal);
	}
	
	@Override
	public String toString() {
		return getEmpId()+"\t"+getEmpName()+"\t"+getDateOfJoining()+"\t"+getBasicSal();
	}
	
}
