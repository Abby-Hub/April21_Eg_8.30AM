package main;

public class VegPizza extends Pizza {
	private int size;
	private String type;

	public VegPizza(int size, String type) throws InvalidPizzaException{
		if (validate(size, type)) {
			this.size = size;
			this.type = type;
		} else {
			
				throw new InvalidPizzaException("Invalid pizza size and type u choosen... pls check :-(");
			
		}
	}

	@Override
	public float caluclatePrice() {
		float price = 50 * size;
		if (type.equalsIgnoreCase("DELUXE"))
			return price + 100;
		else if (type.equalsIgnoreCase("SUPREME"))
			return price + 200;

		return price;
	}

}
