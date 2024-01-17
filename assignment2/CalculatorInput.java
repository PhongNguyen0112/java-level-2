package assignment2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The CalculatorInput class handles user input for the Assignment 2 CST8284
 * calculator program. It validates and processes mathematical equations
 * provided by the user. Extends CalculatorEngine to utilize its calculation
 * capabilities.
 *
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 2023-11-23
 */
public class CalculatorInput {

	private Scanner keyboard = new Scanner(System.in);
	private Scanner input;
	/**
	 * buffer to take user's input
	 */
	private String buffer;
	/**
	 * num1 and num2 for calculation
	 */
	private int num1, num2;
	/**
	 * sign for operator input and equals to require input "="
	 */
	private String sign, equals;
	private boolean start = true;

	/**
	 * Constructs a new CalculatorInput object.
	 */

	public CalculatorInput() {
	}

	/**
	 * Initiates the input process for mathematical equations. Continuously prompts
	 * the user for input until the user decides to exit.
	 *
	 * @throws Exception If an error occurs during the input or calculation process.
	 */
	public void startInput() throws Exception {
		while (start) {
			System.out.print("Enter your equation: ");
			try {
				buffer = keyboard.nextLine();

				if (buffer.isEmpty()) {
					throw new Exception("Equation incomplete. First number is missing");
				}

				if (buffer.equals("0 =")) {
					System.out.println("Program exiting.");
					break;
				} else {
					input = new Scanner(buffer);

					try {
						num1 = input.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Error: First number is not an integer.");
						continue;
					}

					try {
						if (input.hasNext()) {
							sign = input.next();
						} else {
							throw new Exception("Equation incomplete. Operator is missing.");
						}

						if (!isValidOperator(sign)) {
							throw new Exception("Invalid operator. Valid operators are +, -, /, and *");
						}
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						continue;
					}

					try {
						num2 = input.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Error: Second number is not an integer.");
						continue;
					} catch (NoSuchElementException e) {
						System.out.println("Error: Second number is missing");
						continue;
					}

					try {
						if (input.hasNext("=")) {
							equals = input.nextLine();
							start=false;
						} else {
							throw new Exception("Equation incomplete. Equation must end with =");
						}
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						continue;
					} 
					}
				}
			

			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

	}

	/**
	 * Return the start to input or not
	 * 
	 * @return the boolean start, true is into the loop otherwise, it stops
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * Set the start to get into the loop
	 * 
	 * @param start
	 */
	public void setStart(boolean start) {
		this.start = start;
	}

	/**
	 * Checks if the provided operator is a valid mathematical operator.
	 *
	 * @param operator The operator to be validated.
	 * @return true if the operator is valid, false otherwise.
	 */
	private boolean isValidOperator(String operator) {
		return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
	}

	/**
	 * Gets the first number from the input equation.
	 *
	 * @return The first number.
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * Gets the second number from the input equation.
	 *
	 * @return The second number.
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * Gets the operator from the input equation.
	 *
	 * @return The operator.
	 */
	public String getSign() {
		return sign;
	}
}
