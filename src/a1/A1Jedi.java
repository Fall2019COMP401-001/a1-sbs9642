package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// find total items in the store
		int totalItemCount = scan.nextInt();
				
		// create array of all items to record, # of customers, # of items, and item names
		int[] customersPerItem = new int[totalItemCount];
		int[] totalItems = new int[totalItemCount];
		String[] itemNames = new String[totalItemCount];
		// for loop to build item name array
		for (int i=0; i<totalItemCount; i++) {
			itemNames[i] = scan.next();
			scan.nextDouble(); // don't need item prices
		}   // product index ^^^ 
		
		
		
		
		// find total number of customers
		int customerCount = scan.nextInt();
		
		// create 2d array[length of customers][length of total items]
		int[][] itemsArray = new int[customerCount][totalItemCount];
								
		//for loop to separate customer purchases
		for (int i=0; i<customerCount; i++) {
			scan.next();
			scan.next();
			// names are null
			
			//scan for item amt
			int itemQuantity = scan.nextInt();
			
			// loop through items adding values to the 2d index
			for (int j=0; j<itemQuantity; j++) {
				int q = scan.nextInt();
				String name = scan.next();
				
				for (int k=0; k<totalItemCount; k++) {
					if (name.equals(itemNames[k])) {
						itemsArray[i][k] += q;
					}
				}				
			}
		}
		// now use itemsArray and a double for loop  
		//to find out how many customers bought the item and the total items bought
		for (int i=0; i<customerCount; i++) {
			for (int j=0; j<totalItemCount; j++) {
				if (itemsArray[i][j] > 0) {
					customersPerItem[j] += 1;
					totalItems[j] += itemsArray[i][j];
				} else {
					customersPerItem[j] += 0;
				}
			}
		}
		for (int i=0; i<totalItemCount; i++) {
			if (customersPerItem[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customersPerItem[i] + " customers bought " + totalItems[i] + " " + itemNames[i]);
			}
		}
		scan.close();
	}
}




