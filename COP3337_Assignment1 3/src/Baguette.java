public class Baguette extends Item {
	/**
	* Constructor for Baguette class
	*/
	public Baguette(String name, double price) {
		super.cost = (int) Math.round(price);
		super.name = name;
	}
	
	/**
	* Returns string from the description of Item type Baguette
	* @return string from the description of Item type Baguette
	*/ 
	public String toString() {
		String s = "";
		s += super.name + "\t\t\t" + GroceryStore.cents2dollarsAndCents(super.cost);
		
		return s;
	}
}