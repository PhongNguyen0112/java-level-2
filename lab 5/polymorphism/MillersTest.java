package polymorphism;

import java.util.Scanner;

/**
 * This is the main class for the Miller Pay System. It prompts for input of
 * hours worked for different roles of the company and prints the total pay for
 * each person.
 * 
 * @author Hong Phong Nguyen
 * @see Supervisors
 * @see Consultants
 * @see Employees
 * @see Millers
 */
public class MillersTest {
	/**
	 * This is the entry point for the application
	 * 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * the variable to have the answer from user on they want to add more miller or
		 * not
		 * 
		 * @param addNewMiller
		 */
		String addNewMiller;
		Millers[] millers = new Millers[10];

		millers[0] = new Consultants("Abby, Obi", 30);
		millers[1] = new Employees("Andrew, Goodman", 60000);
		millers[2] = new Supervisors("Gloria, Myers", 60000);

		System.out.println("Do you want to add a new miller");
		addNewMiller = sc.nextLine();
		/**
		 * to count how many miller company has
		 * 
		 * @param count
		 */
		int count = 3;

		while (addNewMiller.equalsIgnoreCase("Y")) {
			for (count = 3; count < millers.length;) {
				System.out.println("Name of the new miller");
				String millerName = sc.nextLine();
				millers[count].setName(millerName);
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print("Enter the hours done by " + millers[i].getName() + ": ");
			int hoursWorked = sc.nextInt();
			double biWeeklyPay = millers[i].biWeeklyPay(hoursWorked);

			// Format the output to display one decimal place
			System.out.printf("Total Pay for this miller is: %.1f%n", biWeeklyPay);
		}
	}
}
