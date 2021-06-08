package com.exp;

public class VoteCheck {
	
	public static void main(String[] args)  {
		System.out.println("main starts...");
		int age = 2;
		if(age >=18)
			System.out.println("Valid to Vote...");
		else
		
			try {
				throw new InvalidAgeException("you are Not Allowed to Vote");
			}catch (InvalidAgeException e) {
				// TODO: handle exception
				System.err.println(e);
			}
		
		System.out.println("main ends...");
	}

}
