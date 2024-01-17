package assignment2;

/**
 * The CalculatorEngine class performs basic arithmetic operations. It includes
 * methods to set an equation and calculate the result based on the provided
 * numbers and operator.
 *
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 2023-11-23
 */
public class CalculatorEngine {

	private int num1;
	private int num2;
	private String sign;

	/**
	 * Constructs a new CalculatorEngine object.
	 */
	public CalculatorEngine() {
	}

	/**
	 * Performs the calculation based on the set equation and prints the result.
	 * 
	 * @param num1 The first operand.
	 * @param sign The operator (+, -, *, /).
	 * @param num2 The second operand.
	 */
	public void calculate(int num1, String sign, int num2) {
		if (sign.equals("+")) {
			System.out.println("That answer is: " + add(num1, num2));
		} else if (sign.equals("-")) {
			System.out.println("That answer is: " + subtract(num1, num2));
		} else if (sign.equals("*")) {
			System.out.println("That answer is: " + multiply(num1, num2));
		} else {
			System.out.println("That answer is: " + divide(num1, num2));
		}
	}

	/**
	 * Adds two numbers.
	 *
	 * @param num1 The first number.
	 * @param num2 The second number.
	 * @return The sum of num1 and num2.
	 * 
	 *         This method adds two integers and handles integer overflow, returning
	 *         Integer.MAX_VALUE in case of overflow.
	 */
	private int add(int num1, int num2) {
		try {
			Math.addExact(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println("Error: Integer overflow");
			return Integer.MAX_VALUE;
		}
		return Math.addExact(num1, num2);
	}

	/**
	 * Subtracts num2 from num1.
	 *
	 * @param num1 The minuend.
	 * @param num2 The subtrahend.
	 * @return The result of subtracting num2 from num1.
	 * 
	 *         This method subtracts two integers and handles integer overflow,
	 *         returning Integer.MIN_VALUE in case of overflow.
	 */
	private int subtract(int num1, int num2) {
		try {
			Math.subtractExact(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println("Error: Integer overflow");
			return Integer.MIN_VALUE;
		}
		return Math.subtractExact(num1, num2);
	}

	/**
	 * Multiplies two numbers.
	 *
	 * @param num1 The first factor.
	 * @param num2 The second factor.
	 * @return The product of num1 and num2.
	 * 
	 *         This method multiplies two integers and handles integer overflow,
	 *         returning Integer.MAX_VALUE in case of overflow.
	 */
	private int multiply(int num1, int num2) {
		try {
			Math.multiplyExact(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println("Error: Integer overflow");
			return Integer.MAX_VALUE;
		}
		return Math.multiplyExact(num1, num2);
	}

	/**
	 * Divides num1 by num2.
	 *
	 * @param num1 The dividend.
	 * @param num2 The divisor.
	 * @return The result of dividing num1 by num2.
	 * @throws ArithmeticException If the divisor (num2) is zero.
	 * 
	 *                             This method divides two integers and checks for
	 *                             division by zero, returning 0 in such cases.
	 */
	private int divide(int num1, int num2) {
		try {
			int result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero! Result is invalid, returning zero.");
			return 0;
		}
		return num1 / num2;
	}
}
