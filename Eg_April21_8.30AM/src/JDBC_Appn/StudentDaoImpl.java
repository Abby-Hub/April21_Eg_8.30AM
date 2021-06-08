package JDBC_Appn;

import java.sql.Connection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utils.HibernateUtils;

import db.DbConnection;

public class StudentDaoImpl implements StudentDao {
            //  Connection con = DbConnection.getConnection();
	       SessionFactory fac = HibernateUtils.getSessionFactory();
	@Override
	public boolean save(Student stu) {
		
		 
		 Session session = fac.openSession();
		 Transaction tx = session.beginTransaction();
		Object obj = session.save(stu);
		 tx.commit();
		 session.close();
	/*	 int i =0;
	 * try {
		Statement st = con.createStatement();
		String qry = "insert into Student values("+stu.getId()+",'"+ stu.getName()+"','"+stu.getAddr()+"')";
		//String qry = "delete from Student where id = 1 ";
		System.out.println(qry);
		i = st.executeUpdate(qry);
			String qry = "insert into student values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setInt(1, stu.getId());
			pst.setString(2, stu.getName());
			pst.setString(3, stu.getAddr());
			
			
			
			pst.setDate(4, new java.sql.Date(stu.getJoinDate().getTime()));
			i = pst.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		  if(i != 0 )
			return true;
		else
			return false;
		*/
		
		if(obj != null )
			return true;
		else
			return false;
		
	}

	@Override
	public List<Student> get() {
		 Session session = fac.openSession();
		return session.createCriteria(Student.class).list();
		
		/*List<Student> list = new ArrayList<Student>();
         try {
        		Statement st = con.createStatement();
        		ResultSet rs = st.executeQuery("Select * from Student");
        		while (rs.next()) {
        			Student stu = new Student();
        			stu.setId(rs.getInt(1));
        			stu.setName(rs.getString(2));
        			stu.setAddr(rs.getString(3));
        			stu.setJoinDate(rs.getDate(4));
        			
        			// add stu obj to List
        			list.add(stu);
        			
        		}

         }catch (Exception e) {
        	 e.printStackTrace();
         }
		
		return list;
*/	}

	@Override
	public Student get(int id) {
		Session session = fac.openSession();
		return session.get(Student.class, id);
		
		/*Student stu = null;
		 try {
//     		Statement st = con.createStatement();
			 String qry = "Select * from Student where id = ?";
			 PreparedStatement pst= con.prepareStatement(qry);
			 pst.setInt(1, id);
     		ResultSet rs = pst.executeQuery();
     		if (rs.next()) {
     			 stu = new Student();
     			stu.setId(rs.getInt(1));
     			stu.setName(rs.getString(2));
     			stu.setAddr(rs.getString(3));
     		}

      }catch (Exception e) {
     	 e.printStackTrace();
      }

		return stu;
*/	}

	@Override
	public boolean update(int id, String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(int id) {
		Student st = get(id);
		if(st != null)
			return true;
		else
			return false;
	}

}
