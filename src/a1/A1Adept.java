package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
		
			// find total items in the store
			int totalItemCount = scan.nextInt();
		
			// create arrays all item names and prices 
			String[] itemNames = new String[totalItemCount];
			double[] itemPrices = new double[totalItemCount];
			for (int i=0; i<totalItemCount; i++) {
				itemNames[i] = scan.next();
				itemPrices[i] = scan.nextDouble();
			}
			// this ^^ will be used to look up item prices later
			
		
			
			
			// find total number of customers
			int customerCount = scan.nextInt();
			
			// create array for customer names and customer totals
			String[] customerNames = new String[customerCount];
			double[] customerTotals = new double[customerCount];
			//create variables for total money spent and total items purchased
			double totalExpense = 0.0;
			int totalItemsPurchased = 0;
			//create variables that will item count and name
			int itemCount;
			String itemName = new String("");
						
			//for loop to separate customers
			for (int i=0; i<customerCount; i++) {
				customerNames[i] = scan.next() + " " + scan.next();
				
				// find the total number of item types that each customer bought
				int itemTypeCount = scan.nextInt();
				//for loop that adds first and last per loop
				for (int j=0; j<itemTypeCount; j++) {
					itemCount = scan.nextInt();
					itemName = scan.next();
					double indivisualExpense = 0.0;

					
					// create new for loop to append item array and calculate item price
					for (int k=0; k<totalItemCount; k++) {
						if (itemName.equals(itemNames[k])) {
							double x = ( Double.valueOf(itemCount) * itemPrices[k]);
							indivisualExpense += x;
							totalExpense += x;
							totalItemsPurchased += itemCount;
						}
					}
					customerTotals[i] += indivisualExpense;
				}
			}
			int biggestIndex = 0;
			int smallestIndex = 0;
			for (int i=0; i<customerCount; i++) {
				if (customerTotals[i] > customerTotals[biggestIndex]) {
					biggestIndex = i;
				}
				if (customerTotals[i] < customerTotals[smallestIndex]) {
					smallestIndex = i;
				}
			}
			scan.close();
			
			
			System.out.println("Biggest: " + customerNames[biggestIndex] + " (" + String.format("%.2f", customerTotals[biggestIndex]) + ")");
			System.out.println("Smallest: " + customerNames[smallestIndex] + " (" + String.format("%.2f", customerTotals[smallestIndex]) + ")");
			System.out.println("Average: " + String.format("%.2f", ( totalExpense) / ( Double.valueOf(customerCount))));
			//System.out.println(totalExpense + "    " + Double.valueOf(customerCount));
			
			
	}
}
							
			