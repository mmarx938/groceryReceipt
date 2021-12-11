import java.util.ArrayList;

public class Checkout {
	private static ArrayList<Item> lItem = new ArrayList<>();
	
	/**
	* Adds the item type rice to the checkout
	*/ 
	public void enterItem(Rice objRice) {
		lItem.add(objRice);
	}
	
	/**
	* Adds the item type Baguette to the checkout
	*/ 
	public void enterItem(Baguette objBaguette) {
		lItem.add(objBaguette);
	}
	
	/**
	* Adds the item type FlavoredBaguette to the checkout
	*/ 
	public void enterItem(FlavoredBaguette objFlavoredBaguette) {
		lItem.add(objFlavoredBaguette);
	}
	
	/**
	* Adds the item type Egg to the checkout
	*/
	public void enterItem(Egg objEgg) {
		lItem.add(objEgg);
	}
	
	/**
	* Returns the number of items in checkout
	* @return the number of items in checkout
	*/ 
	public int numberOfItems() {
		return lItem.size();
	}
	
	/**
	* Returns the total cost in cents of the items in checkout
	* @return the total cost in cents of the items in checkout
	*/ 
	public int totalCost() {
		int totalCost = 0;
		
		for(int i=0; i<lItem.size();i++) {
			totalCost += lItem.get(i).getCost();
		}
		
		return totalCost;
	}
	
	/**
	* Returns the total tax in cents of the Items in checkout
	* @return the total tax in cents of the Items in checkout
	*/ 
	public int totalTax() {
		return (int) Math.round(totalCost() * (GroceryStore.TAX_RATE / 100));
	}
	
	/**
	* Clear the checkout
	*/ 
	public void clear() {
		lItem.clear();
	}
	
	/**
	* Returns string in receipt format from checkuot
	* @return string in receipt format from checkuot
	*/ 
	public String toString() {
		String print = ""; 
		print = "       " + GroceryStore.STORE_NAME + "\n       =======================\n\n";
		
		for(int i=0;i<lItem.size();i++) {
			print += lItem.get(i) + "\n";
		}
		
		print += "\nTax: \t\t\t\t" + GroceryStore.cents2dollarsAndCents(this.totalTax());
		print += "\nTotal Cost: \t\t\t" + GroceryStore.cents2dollarsAndCents(this.totalCost() + this.totalTax());
		
		return print;
	}
}