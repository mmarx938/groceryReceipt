public class Rice extends Item {
	private double weight;
	private double price;
	
	/**
	* Constructor for Rice class
	*/
	public Rice(String name, double weight, double price) {
		super.cost = (int) Math.round((weight * price));
		super.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	/**
	* Returns string from the description of Item type rice
	* @return string from the description of Item type rice
	*/ 
	public String toString() {
		String s = "";
		s += this.weight + " lbs. @ " + this.price + " /lb.\n";
		s += super.name + "\t\t\t" +  GroceryStore.cents2dollarsAndCents(super.cost);
		
		return s;
	}
}