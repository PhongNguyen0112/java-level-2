/**
 * File name: ButtonCounterTester.java
 * Author: Hong Phong Nguyen, 041099229
 * Course: CST8284 321
 * Assignment: Lab 1
 * Date: September 12th,2023
 * Professor: Leanne Seaward
 * Purpose: This class that would test the ButtonCounter
 * Class list: ButtonCounterTester,ButtonCounter
 */
/**
 * This class that would test the ButtonCounter
 * @author Hong Phong Nguyen
 * @see ButtonCounter
 * @version 1.0
 * @since Java 17.0.7
 */
public class ButtonCounterTester {
	/**
     * The main method used as entry point
     *
     * @param args the command-line arguments
     */
	public static void main(String[] args) {
		ButtonCounter button = new ButtonCounter();
		button.click();// click 1
		button.click();// click 2
		button.click();// click 3
		System.out.println(button.getValue());// output the number of clicks
		System.out.println("Expected: 3");
		button.undo();// undo a click to change it to 2
		System.out.println(button.getValue());// output the number of clicks after undo
		System.out.println("Expected: 2");
		button.reset();// reset the click
		System.out.println(button.getValue());// output the number of clicks after reset
		System.out.println("Expected: 0");
	}
}
