/**
 * The `CommissionProgrammer` class extends the `Programmer` class and
 * represents a programmer whose payment is based on commission. It includes
 * details such as gross sales and commission rate, and provides methods to set
 * and retrieve these details, calculates the payment amount, and generates a
 * string representation of the programmer.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see Programmer
 */
public class CommissionProgrammer extends Programmer {

	/**
	 * The gross sales of the commission programmer.
	 */
	private double grossSales;

	/**
	 * The commission rate of the commission programmer.
	 */
	private double commissionRate;

	/**
	 * Constructs a `CommissionProgrammer` object with specified first name, last
	 * name, social security number, month, year, gross sales, and commission rate.
	 * 
	 * @param firstName            The first name of the programmer.
	 * @param lastName             The last name of the programmer.
	 * @param socialSecurityNumber The social security number of the programmer.
	 * @param month                The month of the programmer's employment.
	 * @param year                 The year of the programmer's employment.
	 * @param grossSales           The gross sales of the commission programmer.
	 * @param commissionRate       The commission rate of the commission programmer.
	 * @throws IllegalArgumentException If commission rate is not in the range (0.0,
	 *                                  1.0) or gross sales is less than 0.0.
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * Sets the gross sales of the commission programmer.
	 * 
	 * @param grossSales The new gross sales of the commission programmer.
	 * @throws IllegalArgumentException If gross sales is less than 0.0.
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/**
	 * Gets the gross sales of the commission programmer.
	 * 
	 * @return The gross sales of the commission programmer.
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * Sets the commission rate of the commission programmer.
	 * 
	 * @param commissionRate The new commission rate of the commission programmer.
	 * @throws IllegalArgumentException If commission rate is not in the range (0.0,
	 *                                  1.0).
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * Gets the commission rate of the commission programmer.
	 * 
	 * @return The commission rate of the commission programmer.
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Implements the `getPaymentAcount` method from the `Payme` interface.
	 * Calculates and returns the payment amount for the commission programmer.
	 * 
	 * @return The payment amount for the commission programmer.
	 */
	@Override
	public double getPaymentAcount() {
		return getCommissionRate() * getGrossSales();
	}

	/**
	 * Returns a string representation of the `CommissionProgrammer` object.
	 * 
	 * @return The string representation of the `CommissionProgrammer` object.
	 */
	@Override
	public String toString() {
		return String.format(
				"commission programmer: %s %s\n" + "social security number: %s\n"
						+ "gross sales: $%.2f; commission rate: %.2f",
				getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate());
	}
}