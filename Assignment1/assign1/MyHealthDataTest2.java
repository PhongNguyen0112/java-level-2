/**
 * File name: MyHealthDataTest2.java
 * Author: Hong Phong Nguyen, 041099229
 * Course: CST8284 321
 * Assignment: Assignment1
 * Date: October 15th,2023
 * Professor: Leanne Seaward
 * Purpose: This class use junit4 to check method correctBMI() and incorrectBMI() of MyHealthData class
 * Class list: MyHealthData, MyHealthDataTest2
 */
/**
 * MyHealthDataTest2 is a JUnit 4 class to check method correctBMI() and incorrectBMI() of MyHealthData class
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 * @see MyHealthData
 */
package assign1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MyHealthDataTest2 {
	
	private static final double EPSILON = 0.00000001;
	@Test
	public void correctBMI() {
		MyHealthData patient = new MyHealthData("Phong", "Nguyen", "Male", 66.93, 154.3234, 2002, 2023);
		double resultBMI = patient.calculateBMI(154.3234, 66.93);
		double expectedBMI = 24.21840056;
		Assert.assertEquals(expectedBMI, resultBMI, EPSILON);
	}

	@Test
	public void testIncorrectBMI() {
		/**
		 * Create a MyHealthData object with sample data
		 */
		MyHealthData patient = new MyHealthData("Phong", "Nguyen", "Male", 66.93, 154.3234, 2002, 2023);
		/**
		 * This is based on intentionally incorrect math because of making a mistake on
		 * calculating weight * 703 / (height * weight) instead if (height*height)
		 */
		double expectedcorrectBMI = 24.21840056;

		double actualIncorrectBMI = patient.incorrectBMI(154.3234, 66.93);
		Assert.assertEquals(expectedcorrectBMI, actualIncorrectBMI, EPSILON);
	}
}
