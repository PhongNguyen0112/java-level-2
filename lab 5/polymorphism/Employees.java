
package polymorphism;

/**
 * This class represents the employee. An employee is paid the same (particular)
 * amount regardless of the hours (additional) the employee worked.
 */
public class Employees extends Millers {
	private double annualPay;

	/**
	 * Constructs an employee with a given name and an annual pay.
	 * 
	 * @param name the name of this employee
	 * @param pay  the annual pay of the employee
	 */
	public Employees(String name, double pay) {
		setName(name);
		annualPay = pay;
	}

	/**
	 * This portion of code computes the bi-weekly pay of work done by the
	 * employees.
	 * 
	 * @param hoursWorked the number of hours worked bi-weekly
	 * @return the pay for the given number of hours
	 */
	@Override
	public double biWeeklyPay(int hoursWorked) {
		return annualPay / 26;
	}
}
