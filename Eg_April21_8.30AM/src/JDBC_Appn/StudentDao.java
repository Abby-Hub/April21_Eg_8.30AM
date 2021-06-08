package JDBC_Appn;

import java.util.List;

public interface StudentDao {
	boolean save(Student student); // save student data into DB table
	
	List<Student> get(); // returns All Student Records as List Collection

	Student get(int id); // returns Student data if id exist otherwise return null

	boolean update(int id, String address);

	boolean delete(int id);

	boolean search(int id);
}
