package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// An integer count of the number of items in the store:
		
		int inventory = scan.nextInt();
		
		// Array declarations to store the item and price, & a 
		// for loop to run through the input item info:
		
		String[] item = new String[inventory];
		double[] price = new double[inventory];
		
		for (int i=0; i<inventory; i++) {
	  		String inventoryItem = scan.next();
	  		item[i] = inventoryItem;
	  		
	 		double inventoryPrice = scan.nextDouble();
	 		price[i] = inventoryPrice;
	 	
		}	
		
		// integer count of the number of customers:
		
	 	int numCustomers = scan.nextInt();
	 	
	 	// Arrays to store names and totals data regarding customer purchases:
	 	
	 	String[] firstname = new String[numCustomers];
	 	String[] lastname = new String[numCustomers];
	 	
	 	double cost = 0; // initialized to keep track of individual total prices
	 	double[] totals = new double[numCustomers]; // to store each customer's (index) final total
	 	
	 	// for loop to scan through initial customer data:
 		
	 	for (int j=0; j<numCustomers; j++) {
	 		
	 		String first = scan.next();
	 		firstname[j] = first;
	 		
	 		String last = scan.next();
	 		lastname[j] = last;

	 		int totalItemsBought = scan.nextInt();
	 		
	 		double[] register = new double[totalItemsBought]; // to hold price of items one customer bought
	 		
	 		// for loop to run through customer purchases:
	 		
		 		for (int k=0; k<totalItemsBought; k++) {
		 			
		 			int itemQuantity = scan.nextInt();
		 			
		 			String itemInCart = scan.next();
		 			
			 	// another for loop to find purchased item in item array (store's inventory):
		 			
			 		for (int l = 0; l < inventory; l++) { 

			 			if (itemInCart.equals(item[l])) {
			 				
			 				cost = price[l]*itemQuantity; // when found, find and store cost of how many bought
			 				register[k] = cost;
			 			}
			 			
			 		}
			 		
			 		// for loop to update the checkout/final price of all items for each customer:
			 		
			 		double totalCost = 0;
			 		
				 	for (int m=0; m<totalItemsBought; m++) {
				 		totalCost += register[m];
				 		totals[j] = totalCost; // store the final price for the specific customer
				 	}
	 	
		 		}	
	
	 	}
	 	
	 	// set variables and started for loop with nested if 
	 	// statements to compare totals and find the largest/smallest:

	 	double smaller = totals[0];
	 	double bigger = totals[0];

	 	String biggest = "";
	 	String smallest = "";
	 		 
		for (int n=0; n<totals.length; n++) {
			 
			if (totals[n] <= smaller) {
		 		smaller = totals[n];
		 		smallest = firstname[n] + " " + lastname[n];
			}	
					
			 if (totals[n] >= bigger) {
			 	bigger = totals[n];	
				biggest = firstname[n] + " " + lastname[n];					
		
			 }
	 	
		}
		
		// to find the average (avg) of all price totals:
		
		double add = 0;
		double avg = add;
		
		for (int o=0; o<totals.length; o++) {
			add += totals[o]; // adds all of the elements in the totals array together...
		}
		
		avg = add / totals.length; // ...then divides it by the total number of elements added together
		
		// code to print output:
		
		System.out.println("Biggest: " + biggest + " (" + String.format("%.2f",bigger) + ")");
		System.out.println("Smallest: " + smallest + " (" + String.format("%.2f",smaller) + ")");
	 	System.out.println("Average: " + String.format("%.2f", avg));	
	 
	}
	
}
