package main;

import com.sun.org.apache.regexp.internal.recompile;

public class VegPizza extends Pizza {
	private int size;
	private String type;
	
	

	public VegPizza(int size, String type)  {
		if(validate(size, type)) {
		this.size = size;
		this.type = type;
		}
		else
			System.out.println("Invalid pizza size and type u choosen... pls check :-(");
			//throw new InvalidPizzaException();
	}



	@Override
	public float caluclatePrice() {
		float price = 50 * size;
		if(type.equalsIgnoreCase("DELUXE"))
			return price+100;
		else
			if (type.equalsIgnoreCase("SUPREME")) 
				return price+200;
		
		return price;
	}
	
}
