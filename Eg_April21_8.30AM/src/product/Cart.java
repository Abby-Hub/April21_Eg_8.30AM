package product;

public class Cart {
	private float totalPrice;
	
	public void addItem(Item item) {
		System.out.println( item.getItemName() + " Item Added to Cart");
		totalPrice += item.getItemPrice();
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
}
