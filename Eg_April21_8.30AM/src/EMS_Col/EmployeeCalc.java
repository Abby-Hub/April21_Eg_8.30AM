package EMS_Col;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class EmployeeCalc {
	List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e) {
		boolean flag = empList.add(e);
	   return flag;
	}
	
	public List<Employee> showEmployees() {
		if(empList.isEmpty())
			return null;
		else
		return empList;
	}
	
	public Employee searchEmployee(String empId) throws IdNotFoundException {  // E102
		for (Employee e : empList) {
			if(e.getEmpId().equals(empId)) 
				return e;
		}
		throw new IdNotFoundException("Id Not found :"+empId);
	}
	
	public boolean deleteEmployee(String empId) throws IdNotFoundException{
		for (Employee e : empList) {
			if(e.getEmpId().equals(empId)) 
			   return empList.remove(e);
		}

		throw new IdNotFoundException("Id Not found :"+empId);
	}
}
