package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// An integer count of the number of items in the store:
		
		int inventory = scan.nextInt();
		
		// An array declaration to store the item and price, & a 
		// for loop to run through the input item info:
		
		String[] item = new String[inventory];

		for (int i=0; i<inventory; i++) {
			
	  		String inventoryItem = scan.next();
	  		item[i] = inventoryItem;
	  		
	  		Double inventoryPrice = scan.nextDouble();
	 	
		}	
		
	 	int numCustomers = scan.nextInt(); // integer count of the number of customers
	 	int[] whatQuantity = new int[inventory]; // to store quantities of items purchased
	 	int[] customerTotals = new int[inventory]; // array to count how many customers purchased each item

	 	// for loop to scan through customer data:
 		
	 	for (int j=0; j<numCustomers; j++) {
	 		
	 		// a boolean array with each element initialized to false created 
	 		// to increment the count of customers purchasing a specific 
	 		// item in inventory in the loop:
	 		
	 		boolean[] f = new boolean[inventory]; 
	 		for (int foop=0; foop<inventory; foop++) {
	 			f[foop] = false;
	 		}
	 		
	 		String first = scan.next();
	 		String last = scan.next();
	 		
	 		int totalItemsBought = scan.nextInt();
	 		
	 		for (int k=0; k<totalItemsBought; k++) {
	 			
	 			int quantityBought = scan.nextInt();
	 			
	 			String itemBought = scan.next();

	 			// for loop to match the item held in variable itemBought with 
	 			// the same item in the item array of the store's inventory:
	 			
	 			for (int l=0; l<inventory; l++) {
	 				
	 				if (itemBought.equals(item[l])) {
	 					whatQuantity[l] += quantityBought; // updating quantity totals of how many of the specific item was purchased
	 					if (f[l] == false) {
	 						customerTotals[l] += 1;	// incrementing how many customers purchased itemBought by 1 customer
	 						f[l] = true; 
	 						// change the element to boolean true to prevent customerTotals from incrementing 
	 						// IF the same customer purchased the item again
	 					}
	 					
	 				}
	 				
	 			}
	 			 			
	 		}
	 
	 	}
	 	
	 	// for loop to run through the store's item array (inventory) and print out x number of customers 
	 	// purchased y quantity of items.
 		for (int m=0; m<inventory; m++) {
 			
 			if (customerTotals[m] == 0) { // in case no customers purchased the specific item
 				System.out.println("No customers bought " + item[m]);
 				
 			} else { 
 				System.out.println(customerTotals[m] + " customers bought " + whatQuantity[m]+ " " + item[m]);
 				
 			}
 				
 		}
 		
	}
}
