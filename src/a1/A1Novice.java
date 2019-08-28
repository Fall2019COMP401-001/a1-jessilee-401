package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		// The total number of customers:
		
			int numberOfCustomers = scan.nextInt();
			
		// A for loop to scan through input information:
			
			for (int i=0; i<numberOfCustomers; i++) {
				String first = scan.next();
				String last = scan.next();		
				int totalItemsBought = scan.nextInt();
				
				
				int[] quantity = new int[totalItemsBought]; // to gather the quantities of each item into an array
				double[] cost = new double[totalItemsBought]; // to gather the price of each item into an array
				double[] totals = new double[numberOfCustomers];
				
				for (int p=0; p<totalItemsBought; p++) {
					
					int itemQuantity = scan.nextInt();
					quantity[p] = itemQuantity;
					String item = scan.next();
					
					double price = scan.nextDouble();
					cost[p] = price;
				
				}
				
				totals[i] = checkout(quantity, cost); // function call to find the total cost of transaction
				
				
				char f = first.charAt(0); // to make the first name of the customer their first initial
				
				// to print out the required output:
				
				System.out.println(" " + f + ". " + last + ": " + totals[i]);
			}
			
		// No more to scan, so this is to close the scanner:	
			scan.close();
			
	}
	
	/* checkout
	 * 
	 * Calculates the total price of the customer's transaction by multiplying
	 * the quantity of each item purchased by the cost of the item, and adding the 
	 * result to variable c.
	 * 
	 * Input: an array of the number of items bought, and an array of the cost
	 * 			of the item.
	 * 
	 * Output: the product of the two input arrays, called "c".
	 * 
	 * Preconditions: 
	 * The input arrays must not be null.
	 */
		
	static double checkout(int[] quantity, double[] cost) {
		
		double c = 0;
		
		for (int i=0; i<quantity.length; i++) {
			c += quantity[i]*cost[i];
			
			String.format("%.2f", c);
				
		}
		
		return c;
		
		
			
			
			
			
		
		
			
			
			
			
			
		
		
		
	}
}