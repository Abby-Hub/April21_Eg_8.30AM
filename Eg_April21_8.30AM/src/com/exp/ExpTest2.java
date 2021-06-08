package com.exp;

public class ExpTest2 {
	
	public void m1()throws ClassNotFoundException {
		System.out.println("******   Some logics ************");
		
		throw new ClassNotFoundException(".class file not found");
	
	}

	public static void main(String[] args) {
		System.out.println("main starts...");
		try {
			new ExpTest2().m1();
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		System.out.println("main ends...");
	}

}
