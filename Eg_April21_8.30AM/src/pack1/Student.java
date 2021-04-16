package pack1;

import java.io.Serializable;

public class Student  implements Serializable{
	private int id;
	private String name;
	private int marks;
	private char gender;

	public Student() {
		System.out.println("Default");
	}
	
	public Student(int id, String name, int marks, char gender) {
		this.id = id;
		this.name = name;
		this.marks = marks;	
		this.gender = gender;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(gender);
	}

}
