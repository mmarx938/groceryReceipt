public class FlavoredBaguette extends Item {
	public static double additionalvalue;
	public static String flavor;
	
	/**
	* Constructor for FlavoredBaguette class
	*/
	public FlavoredBaguette(String name, double price, String flavor, double additionalvalue) {
		this.flavor = flavor;
		this.additionalvalue = additionalvalue;
		super.name = name;
		super.cost = (int) Math.round(price + additionalvalue);
	}
	
	/**
	* Returns string from the description of Item type FlavoredBaguette
	* @return string from the description of Item type FlavoredBaguette
	*/ 
	public String toString() {
		String s = "";
		s += super.name + " with\n";
		s += this.flavor + "\t\t\t" + GroceryStore.cents2dollarsAndCents(super.cost);
		
		return s;
	}
}