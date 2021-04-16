package main;

public abstract class Pizza {
	public abstract float caluclatePrice();
	
	public boolean validate(int size, String type) {
		if(size == 6 || size == 9 || size == 12) {
			if(type.equalsIgnoreCase("PLAIN") || type.equalsIgnoreCase("DELUXE") || type.equalsIgnoreCase("SUPREME"))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
