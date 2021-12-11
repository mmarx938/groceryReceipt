public class TestCheckout {
	public static void main(String[] args) {
		/*
		* It creates the checkout object
		*/
	    Checkout checkout = new Checkout();
	    
	    
	    /*
		* It adds the different items to the Checkout
		*/
	    checkout.enterItem(new Rice("Basmati Rice", 2.25, 399));
	    checkout.enterItem(new Baguette("Wheat Baguette",105));
	    checkout.enterItem(new FlavoredBaguette("White Baguette",145, "Chocolate", 50));
	    checkout.enterItem(new Egg("Grade A Organic Eggs", 4, 399));
    
	    
	    /*
		* It prints the results 
		*/
	    System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
	    System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
	    System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
	    System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
	    System.out.println(checkout.toString());
	    
	    
	    /*
		* Cleans the checkout
		*/
	    checkout.clear();
	    
	    
	    /*
		* It adds the different items to the Checkout
		*/
	    checkout.enterItem(new Baguette("Organic Baguette",145));
	    checkout.enterItem(new FlavoredBaguette("Wheat Baguette",105, "Caramel", 50));
	    checkout.enterItem(new Rice("Indian Brown Rice", 1.33, 89));
	    checkout.enterItem(new Egg("Grade B Egg", 4, 399));
	    checkout.enterItem(new Rice("Arabic White Rice", 1.5, 209));
	    checkout.enterItem(new Rice("Spanish Yellow Rice",3.0, 109));
	    
	    
	    /*
		* It prints the results 
		*/
	    System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
	    System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
	    System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
	    System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
	    System.out.println(checkout);
	    
	}
}