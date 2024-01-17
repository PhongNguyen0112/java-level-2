package assignment2;

/**
 * The Calculator class serves as the main entry point for the Assignment 2
 * CST8284 calculator program. It print my student name and number to the
 * screen, inform the user how to use the calculator, and then instantiate the
 * CalculatorEngine and CalculatorInput classes.
 *
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 2023-11-23
 */
public class Calculator {

	/**
	 * The main method that initiates the calculator program.
	 *
	 * @param args The command-line arguments (not used in this program).
	 * @throws Exception If an error occurs during the execution of the calculator.
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to the Assignment 2 CST8284 calculator.");
		System.out.println("Written by Hong Phong Nguyen, #041099229");
		System.out.println("Equations are in the form num1 operator num2 = ");
		System.out.println("Where num1 and num2 must be integers,");
		System.out.println("operator is one of +, -, / or *");
		System.out.println("Enter 0 = to quit.");

		// Initialize the calculator engine and input components
		CalculatorEngine calculatorEngine = new CalculatorEngine();
		CalculatorInput calculatorInput = new CalculatorInput();
		// Start the input process
		while (calculatorInput.isStart()) {
			calculatorInput.startInput();
			// Calculate the input number
			if (!calculatorInput.isStart()) {
				calculatorEngine.calculate(calculatorInput.getNum1(), calculatorInput.getSign(),
						calculatorInput.getNum2());
				calculatorInput.setStart(true);
			}
		}
	}
}