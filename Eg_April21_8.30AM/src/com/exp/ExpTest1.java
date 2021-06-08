package com.exp;

public class ExpTest1 {
	
	public void div() {
		int a = 10;
		int b = 0;
		try {
		/*int c = a/b;   
		System.out.println("Result :" + c);*/
			throw new ArithmeticException("/ by zero asdkgjhasd;kjfhdsfshafkjs");
		}catch (ArithmeticException e) {
			//System.err.println("Don't enter Zero at Denominator...");
			System.err.println(e);
		//	e.printStackTrace();
		}
		System.out.println("***********  Other Logics **************");
	}

	public static void main(String[] args) {
		System.out.println("main starts...");
		new ExpTest1().div();
		System.out.println("main ends...");
	}

}
