package pack1;

public class Test3 {
	 boolean flag = true;  //instance var / Non static var
	
	
	public void addition() {    // non static function  (Instance function)
		int x =10;      // local
		int y =20;
		int z = x+y;
		System.out.println("From Test3, Sum = "+z);
	}
	
	public static void m1() {
		System.out.println("from Test3 ,  m1() invoked...");
		
	}
}
