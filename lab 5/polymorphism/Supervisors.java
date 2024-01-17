package polymorphism;

/**
 * The 'Supervisors' class represents supervisors in a company and extends the
 * 'Millers' class. It calculates the bi-weekly pay for supervisors based on
 * their annual pay and a fixed bonus.
 */
public class Supervisors extends Millers {
	private double annualPay; // The annual pay of the supervisor
	private final double BONUS = 250; // Fixed bonus amount

	/**
	 * Constructs a 'Supervisors' object with the specified name and annual pay.
	 *
	 * @param name The name of the supervisor.
	 * @param pay  The annual pay of the supervisor.
	 */
	public Supervisors(String name, double pay) {
		setName(name);
		annualPay = pay;
	}

	/**
	 * Calculates the bi-weekly pay for a supervisor based on their annual pay and a
	 * fixed bonus.
	 *
	 * @param hoursWorked The number of hours worked (not used in this calculation).
	 * @return The bi-weekly pay for the supervisor.
	 */
	@Override
	public double biWeeklyPay(int hoursWorked) {
		return annualPay / 26 + BONUS;
	}
}
