package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int inventory = scan.nextInt();
		
		for (int i=0; i<inventory; i++) {
			String inventoryItem = scan.next();
			double inventoryPrice = scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		
		for (int j=0; j<numCustomers; j++) {
			String first = scan.next();
			String last = scan.next();
			
			int numItems = scan.nextInt();
			
				for (int k=0; k<numItems; k++) {
					int itemQuantity = scan.nextInt();
					String item = scan.next();
				}
		}
	}
}
