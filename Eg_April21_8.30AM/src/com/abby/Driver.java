package com.abby;

import pack1.Cal;
import pack1.MyCal;

public class Driver {

	public static void main(String[] args) {
		
		
		Cal c = new MyCal();
		System.out.println(c.add(10,20));	
		System.out.println(c.sub(10, 20));
		System.out.println(c.mul(10, 20));
		System.out.println(c.div(10, 2));
	
	  /*   Toy t = new Ball();  // up casting
	     t.move();
	     t.makeSound();
	     
	     
	   Ball b =  (Ball)  t;  // down casting
*/		
		/*Student st1 = new Student();
		
		//st1.id = 101;
		st1.setId(101);
		st1.setName("Scott");
		//st1.marks = 85;
		//st1.gender= 'M';
		
		st1.show();
		
		System.out.println("*******************");
		
		Student st2 = new Student(111, "Dev", 95, 'M');
		st2.show();
		*/
		/*Test3 t = new Test3(); // obj created
		t.addition(); // instance method
		Test3.m1();
		Test2.m1();*/
		
		
		
		
	}

}
