package pack1;

public class Test2 {
	
	public void add() {
		int x =10;
		int y =20;
		int z = x+y;
		System.out.println("Sum = "+z);
	}

	public static void m1() {
		System.out.println("from Test2 , m1() invoked...");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main starts...");
		// create a obj for Test2 
		Test2 t = new Test2();  // obj created
		t.add();
		m1();
		System.out.println("Main Ends...");
	}

}
