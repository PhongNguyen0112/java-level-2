/**
 * The `HourlyProgrammer` class extends the `Programmer` class and represents a
 * programmer paid on an hourly basis. It includes details such as hourly wage
 * and hours worked, and provides methods to set and retrieve these details,
 * calculates the payment amount, and generates a string representation of the
 * programmer.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see Programmer
 */
public class HourlyProgrammer extends Programmer {

	/**
	 * The hourly wage of the programmer.
	 */
	private double wage;

	/**
	 * The hours worked by the programmer.
	 */
	private double hours;

	/**
	 * Constructs an `HourlyProgrammer` object with specified first name, last name,
	 * social security number, month, year, hourly wage, and hours worked.
	 * 
	 * @param firstName            The first name of the programmer.
	 * @param lastName             The last name of the programmer.
	 * @param socialSecurityNumber The social security number of the programmer.
	 * @param month                The month of the programmer's employment.
	 * @param year                 The year of the programmer's employment.
	 * @param wage                 The hourly wage of the programmer.
	 * @param hours                The hours worked by the programmer.
	 * @throws IllegalArgumentException If hourly wage is less than 0.0 or hours
	 *                                  worked is less than 0.0 or greater than
	 *                                  168.0.
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}

	/**
	 * Sets the hourly wage of the programmer.
	 * 
	 * @param wage The new hourly wage of the programmer.
	 * @throws IllegalArgumentException If the hourly wage is less than 0.0.
	 */
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

	/**
	 * Gets the hourly wage of the programmer.
	 * 
	 * @return The hourly wage of the programmer.
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * Sets the hours worked by the programmer.
	 * 
	 * @param hours The new hours worked by the programmer.
	 * @throws IllegalArgumentException If the hours worked is less than 0.0 or
	 *                                  greater than 168.0.
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

	/**
	 * Gets the hours worked by the programmer.
	 * 
	 * @return The hours worked by the programmer.
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * Implements the `getPaymentAcount` method from the `Payme` interface.
	 * Calculates and returns the payment amount for the hourly programmer.
	 * 
	 * @return The payment amount for the hourly programmer.
	 */
	@Override
	public double getPaymentAcount() {
		if (getHours() <= 40) {
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	/**
	 * Returns a string representation of the `HourlyProgrammer` object.
	 * 
	 * @return The string representation of the `HourlyProgrammer` object.
	 */
	@Override
	public String toString() {
		return String.format(
				"hourly Programmer: %s %s\n" + "social security number: %s\n"
						+ "hourly wage: $%.2f; hours worked: %.2f",
				getFirstName(), getLastName(), getSocialSecurityNumber(), getWage(), getHours());
	}
}