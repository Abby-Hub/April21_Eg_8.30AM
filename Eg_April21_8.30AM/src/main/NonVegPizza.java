package main;

public class NonVegPizza extends Pizza {
	private int size;
	private String type;

	public NonVegPizza(int size, String type)  {
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
		float price = 100 * size;
		if (type.equalsIgnoreCase("DELUXE"))
			return price + 150;
		else if (type.equalsIgnoreCase("SUPREME"))
			return price + 250;

		return price;
	}

}
