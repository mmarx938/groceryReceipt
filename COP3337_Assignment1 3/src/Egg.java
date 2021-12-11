public class Egg extends Item {
	private int qty;
	private double price;
	
	/**
	* Constructor for Egg class
	*/
	public Egg(String name, int qty, double price) {
		super.name = name;
		super.cost = (int) Math.round(price * qty / 12);
		this.qty = qty;
		this.price = price;
	}
	
	/**
	* Returns string from the description of Item type Egg
	* @return string from the description of Item type Egg
	*/ 
	public String toString() {
		String s = "";
		s += this.qty + " @ " + this.price + " /dz\n";
		s += super.name + "\t\t" + GroceryStore.cents2dollarsAndCents(super.cost);
		
		return s;
	}
}