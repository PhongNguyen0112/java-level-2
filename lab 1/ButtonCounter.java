/**
 * File name: ButtonCounter.java
 * Author: Hong Phong Nguyen, 041099229
 * Course: CST8284 321
 * Assignment: Lab 1
 * Date: September 12th,2023
 * Professor: Leanne Seaward
 * Purpose: This class models a tally counter
 * Class list: ButtonCounterTester, ButtonCounter
 */
/**
 * This class models a tally counter
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 */
public class ButtonCounter {
	/**
	 * The number count how many times users "clicks" set as variable "count"
	 */
	private int count = 0;// set the count =0

	/**
	 * Increments count value by one when the user use the click method
	 */
	public void click() {
		count++;
	}

	/**
	 * Decrements count value by one when the user use the click method The click
	 * count can not get below 0
	 */
	public void undo() {
		if (count < 1) {
			count = 0;
		} else {
			count--;
		}
	}

	/**
	 * Reset the count click to 0
	 */
	public void reset() {
		count = 0;
	}

	/**
	 * Get the current count of this counter
	 * 
	 * @return the current count
	 */
	public int getValue() {
		return count;
	}
}
