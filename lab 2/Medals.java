/**
 * File name: Medals.java
 * Student Name: Hong Phong Nguyen
 * Lab Professor: Leanne Seward
 * Due Date: 09/24/2023
 * Modified: 09/15/2023
 * Description: This program prints a table of medal winner counts with row totals.
 */
/**
 * This program prints a table of medal winner counts with row totals.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 */
public class Medals {
	/**
	 * The main method used as entry point
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		/**
		 * Set the number of countries as 8
		 * 
		 * @value COUNTRIES
		 */
		final int COUNTRIES = 8;
		/**
		 * Set the number of medals as 3 including (Gold,Silver and Bronze)
		 * 
		 * @value MEDALS
		 */
		final int MEDALS = 3;
		// make an array of String which hold name of countries
		String[] countries = { "Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea",
				"United States" };
		// make an 2D array of String which hold number of different kinds of medals
		// that each country has
		int[][] counts = { { 0, 3, 0 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 3, 1, 1 }, { 0, 1, 0 },
				{ 1, 0, 1 } };

		System.out.println("        Country    Gold  Silver  Bronze   Total");

		// Print countries, counts, and row totals
		for (int i = 0; i < COUNTRIES; i++) {
			System.out.printf("%15s", countries[i]);
			/**
			 * set the total of medals from each country
			 */
			int total = 0;

			// Print each row element and update the row total
			for (int j = 0; j < MEDALS; j++) {
				System.out.printf("%8d", counts[i][j]);
				total = total + counts[i][j];//calculate the total
			}
			System.out.printf("%8d", total);//output the total of medals of each country
			System.out.println();
		}
		int[] holdTotal = new int[3];// set a new Array named holdTotal
		System.out.printf("%15s", "Total");
		for (int i = 0; i < holdTotal.length; i++) {
			for (int j = 0; j < COUNTRIES; j++) {
				holdTotal[i] = holdTotal[i] + counts[j][i];// calculate number of each medals
			}
			System.out.printf("%8d", holdTotal[i]);// Display the total of each medal type
		}
	}
}
