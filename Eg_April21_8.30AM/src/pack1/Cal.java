package pack1;

public abstract class Cal {
		public int add (int x, int y) {
			return x+y;
		}
		
		public int sub (int x, int y) {
			return x-y;
		}
		
		public abstract int mul (int x, int y) ;
		
		public abstract int div (int x, int y);
}
