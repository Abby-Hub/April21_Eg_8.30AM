package jdbc;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		 Date d1 = new Date(); 
		 long ms = d1.getTime();
        System.out.println(d1);
        java.sql.Date sd1 =  new java.sql.Date(ms);
        System.out.println(sd1);
	}

}
