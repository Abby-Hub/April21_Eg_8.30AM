package main;

public class PizzaOnline {
	private float totalSales;
	
	public float order(Pizza pizza) {  
		float price = pizza.caluclatePrice();
		totalSales +=  price;
		return price;
	}
	
	public float getTotalSales() {
		return totalSales;
	}

	public static void main(String[] args) {
		PizzaOnline po = new PizzaOnline();
		VegPizza vp1;
		try {
			vp1 = new VegPizza(6, "PLAIN");
			float amt = po.order(vp1);
			System.out.println(amt);
		} catch (InvalidPizzaException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e);
		}
		
		
		
		
		
		
		
		
		/*NonVegPizza nvp1 = new NonVegPizza(9, "DELUXE");
		VegPizza vp2 = new VegPizza(12, "SUPREME");
		
		float amt = po.order(vp1);
		System.out.println(amt);
		
		amt = po.order(nvp1);
		System.out.println(amt);
		
		amt = po.order(vp2);
		System.out.println(amt);
		
		System.out.println(po.getTotalSales());
		*/
		try {
			new VegPizza(16, "REg");
		} catch (InvalidPizzaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
