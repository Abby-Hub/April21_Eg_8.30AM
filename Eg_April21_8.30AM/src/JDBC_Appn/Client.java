package JDBC_Appn;

import java.util.Date;
import java.util.List;

public class Client {

	public static void main(String[] args)  {
		StudentDao dao = new StudentDaoImpl();
		/*Student st = new Student();
		st.setId(20);
		st.setName("Student 20");
		st.setAddr("Addr20");
		st.setJoinDate(new Date());
		boolean flag = dao.save(st);
		System.out.println(flag);*/
		
		List<Student> list  = dao.get();
		for (Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("******************");
		
		Student st2= dao.get(1);
		if(st2 != null)
		System.out.println(st2);
		else
			//throw new IdNotFoundException("No Student Data Found");
			System.out.println("No Student Data Found");
		
		System.out.println("********************");
		
		 boolean flag = dao.search(1);
		System.out.println(flag);
	    
	}

}
