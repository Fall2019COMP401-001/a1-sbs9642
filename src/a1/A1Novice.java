package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		// initialize customer count
		int customerCount = scan.nextInt();
		
		// for loop to separate customers by customer count
		for (int i=0; i<customerCount; i++) {
			// create output variable
			String output = new String("");

			// scan for first name and add first initial to output
			String firstN = scan.next();
			output += firstN.substring(0, 1) + ". ";
			// scan for last name and add to output
			output += scan.next() + " ";
			
			// scan for item count (new with each loop)
			int itemCount = scan.nextInt();
			// create customer total
			double total = 0.0;
			// for loop through item list
			for (int j=0; j<itemCount; j++) {
				// create new count for item quantity
				double quantityCount = scan.nextInt();
				// scan over item name to ignore
				scan.next();
				// multiply quantity by price and add to customer total
				total += quantityCount * scan.nextDouble();
				output += total;
				System.out.print(output);

			}
		}
		// rinse and repeat
		scan.close();		
	}
}
