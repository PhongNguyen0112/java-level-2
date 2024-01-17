/**
 * File name: MyHealthDataTest.java
 * Lab Professor: Leanne Seward
 * Due Date: 10/15/2023
 * This file is used for testing to output total information after doing some calculations of a patient
 */

/**
 * This is the driver class for this program. This means that it just runs the
 * application with a method main.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 * @see MyHealthData
 */
package assign1;

import java.util.Scanner;

/**
 * This is the entry point for the application, it instantiates information
 * about the patient to do some calculations
 * 
 * @param args Command line arguments are not used by this program.
 */
public class MyHealthDataTest {
	public static void main(String[] args) {
		MyHealthData patient = new MyHealthData("Phong", "Nguyen", "Male", 66.93, 154.3234, 2002, 2023);
		Scanner info = new Scanner(System.in);
		/**
		 * set input for first name
		 */
		System.out.print("First Name: ");
		
		String firstName = info.nextLine();
		patient.setFirstName(firstName);
		/**
		 * set input for last name
		 */
		System.out.print("Last Name: ");
		String lastName = info.nextLine();
		patient.setLastName(lastName);
		/**
		 * set input for gender
		 */
		System.out.print("Gender: ");
		String gender = info.nextLine();
		patient.setGender(gender);
		/**
		 * set input for height
		 */
		System.out.print("Height: ");
		double height = info.nextDouble();
		patient.setHeight(height);
		/**
		 * set input for weight
		 */
		System.out.print("Weight: ");
		double weight = info.nextDouble();
		patient.setWeight(weight);
		/**
		 * set input for Birth Year
		 */
		System.out.print("Birth Year: ");
		int birthYear = info.nextInt();
		patient.setBirthYear(birthYear);
		/**
		 * set input for current year
		 */
		System.out.print("Current Year: ");
		int currentYear = info.nextInt();
		patient.setCurrentYear(currentYear);
		/**
		 * call method all information of a patient after some calculations
		 */
		patient.displayMyHealthData();
	}
}
