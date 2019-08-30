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
		
		// integer count of the number of customers:
		
	 	int numCustomers = scan.nextInt();
	 	int[] whatQuantity = new int[inventory];
	 	int[] customerTotals = new int[inventory];

	 	// for loop to scan through customer data:
 		
	 	for (int j=0; j<numCustomers; j++) {
	 		
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

	 		
	 			
	 			for (int l=0; l<inventory; l++) {
	 				
	 				if (itemBought.equals(item[l])) {
	 					whatQuantity[l] += quantityBought;
	 					if (f[l] = false) {
	 						customerTotals[l] += 1;	
	 						f[l] = true;
	 					}
	 					
	 				}
	 			}
	 			
	 			
	 		}
	 
	 	}
	 	
 		for (int m=0; m<inventory; m++) {
 			
 			if (customerTotals[m] == 0) {
 				System.out.println("No customers bought " + item[m]);
 				
 			} else {
 				System.out.println(customerTotals[m] + " customers bought " + whatQuantity[m]+ " " + item[m]);
 				
 			}
 				
 		}
	}
}
