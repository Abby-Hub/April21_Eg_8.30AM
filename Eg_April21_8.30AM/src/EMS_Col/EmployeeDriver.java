package EMS_Col;

import java.util.Date;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId("E101");
		emp.setEmpName("Emp1");
		emp.setDateOfJoining(new Date());
		emp.setBasicSal(5500);
		
		Employee emp2 = new Employee();
		emp2.setEmpId("E102");
		emp2.setEmpName("Emp2");
		emp2.setDateOfJoining(new Date());
		emp2.setBasicSal(6500);
		
		Employee emp3 = new Employee();
		emp3.setEmpId("E103");
		emp3.setEmpName("Emp3");
		emp3.setDateOfJoining(new Date());
		emp3.setBasicSal(7500);
		
		EmployeeCalc employeeCalc = new EmployeeCalc();
		boolean status = employeeCalc.addEmployee(emp);
		System.out.println(status);
		 status = employeeCalc.addEmployee(emp2);
		System.out.println(status);
		status = employeeCalc.addEmployee(emp3);
		System.out.println(status);
		System.out.println("________________________________");
		
		List<Employee> list = employeeCalc.showEmployees();
		for (Employee employee : list) {
			System.out.println(employee); // display
		}
		
		System.out.println("___________________________");
		Employee employee = null;
		try {
			employee = employeeCalc.searchEmployee("E103");
			System.out.println(employee);
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("____________________________");
		
		try {
			status = employeeCalc.deleteEmployee("E104");
			System.out.println(status);
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("__________________________");
		 list = employeeCalc.showEmployees();
			for (Employee e : list) {
				System.out.println(e); // display
			}
		
	}
}
