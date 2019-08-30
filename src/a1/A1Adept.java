package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// An integer count of the number of items in the store:
		
		int inventory = scan.nextInt();
		
		// An array declaration to store the item and price, & for
		// loop to run through the input item info:
		
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
	 	
	 	// Arrays to store names & totals data regarding customer purchases:
	 	
	 	String[] firstname = new String[numCustomers];
	 	String[] lastname = new String[numCustomers];
	 	
 		double cost = 0; // initialized to keep track of individual total prices
 		double[] totals = new double[numCustomers];
 		

	 	
	 	for (int j=0; j<numCustomers; j++) {
	 		
	 		String first = scan.next();
	 		firstname[j] = first;
	 		
	 		String last = scan.next();
	 		lastname[j] = last;
	 		
	 		int totalItemsBought = scan.nextInt();
	 		
	 		double[] register = new double[totalItemsBought]; 
	 		
	 		// for loop to run through customer purchases:
	 		
		 		for (int k=0; k<totalItemsBought; k++) {
//		 			System.out.println(k);
		 			int itemQuantity = scan.nextInt();
		 			String itemInCart = scan.next();
		 			
			 	// another for loop to find purchased item in inventory array:
			 		for (int l = 0; l < inventory; l++) { 

			 			if (itemInCart.equals(item[l])) {
			 				
			 				cost = price[l]*itemQuantity;
			 				register[k] = cost;
			 			}
					 	double totalCost = 0;
					 	for (int m=0; m<totalItemsBought; m++) {
					 		totalCost += register[m];
					 		totals[j] = totalCost;
					 	}
			 		}

			 	
	 	}
	
		 
	 }
	 	
	 	// set variables and started for loop to compare totals:
 		
	 	double smaller = totals[0];
	 	double bigger = totals[0];

	 	String biggest = "";
	 	String smallest = "";
	 	int hello = 0;
	 	 for (int p = 0; p < totals.length; p++) {
			 if (totals[p] > bigger) {
				 totals[p] = bigger;
				 hello = p;
				 
			 }
	 	 }
		 biggest = firstname[hello] + " " + lastname[hello];
		 int newn = 0;
		 for (int n = 0; n < totals.length; n++) {
			 
			 if (totals[n] < smaller) {
				 totals[n] = smaller;
				 newn = n;
				 

			 }
			 
		 } 
		 smallest = firstname[newn] + " " + lastname[newn];
		 
		 
		 
			 
//			 if (totals.length == 1) {
//				bigger = totals[n];
//				biggest = firstname[n] + " " + lastname[n];
//					
//				smaller = totals[n];
//				smallest = firstname[n] + " " + lastname[n];
//				
//				} else {
//					if (totals[n] < smaller) {
//		 				smaller = totals[n];
//		 				smallest = firstname[n] + " " + lastname[n];
//						
//			 		} else {
//			 			if (totals[n] > bigger) {
//			 				bigger = totals[n];	
//							biggest = firstname[n] + " " + lastname[n];					
//		
//			 			}
//	 			
//			 		} 
//	 			
//				}
	 	
		 
		
		double add = 0;
		double avg = add;
		
		for (int o=0; o<totals.length; o++) {
			add += totals[o];
		}
		
		avg = add / totals.length;
		
		
		System.out.println("Biggest: " + biggest + " (" + String.format("%.2f",bigger) + ")");
		System.out.println("Smallest: " + smallest + " (" + String.format("%.2f",smaller) + ")");
	 	System.out.println("Average: " + String.format("%.2f", avg));	
	 
	 }
	

	 
		
}
