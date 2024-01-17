/**
 * File name: MyHealthDataBase.java
 * Lab Professor: Leanne Seward
 * Due Date: 10/15/2023
 * This file is used for calculating theBMI of a patient
 */
package assign1;

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health
 * Records (EHR) System, also known as Assignment 1. It contains a method to
 * calculate BMI and will contain other methods.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 * @see MyHealthData
 */

public class MyHealthDataBase {
	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 */
	public double calculateBMI(double weightParam, double heightParam) {
		return weightParam * 703 / (heightParam * heightParam);
	}

	/**
	 * Calculate and return an incorrect BMI. Introduce an error in the math.
	 *
	 * @return The incorrectly calculated BMI.
	 */
	public double incorrectBMI(double weight, double height) {
		/**
		 * Introduce an error in the calculation
		 */
		double incorrectBMI = weight * 703 / (height * weight);
		/**
		 * This is intentionally incorrect
		 */
		return incorrectBMI;
	}
}