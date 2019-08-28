package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// An integer count of the number of items in the store:
		
		int inventory = scan.nextInt();
		
		// A for loop to run through each item in the store:
		
		for (int i=0; i<inventory; i++) {
	  		String inventoryItem = scan.next();
	  			
	 		double inventoryPrice = scan.nextDouble();
	 	//		double[] price = new double[inventoryPrice];
		}	
		
		// declaration of the number of customers:
		
	 	int numCustomers = scan.nextInt();
	 	
	 	// for loop to run through customer-related data (ex names and purchases):
	 	
	 	for (int j=0; j<numCustomers; j++) {
	 		String first = scan.next();
	 		String last = scan.next();
	 		
	 		int totalItemsBought = scan.nextInt();
	 	
		 		for (int p=0; p<totalItemsBought; p++) {
		 			int itemQuantity = scan.nextInt();
		 				int[] quantity = new int[itemQuantity];
		 			double itemPrice = scan.nextDouble();
		 	//		String item = scan.next();
		 		
	 			}
		 		
		 	
	 	}
	 	
	 	
		
		
		
	}
}
