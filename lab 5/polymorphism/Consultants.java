
package polymorphism;

/**
 * This code in this file is for the Consultant Class. A Consultant is a miller
 * who is paid for every hour worked.
 */
public class Consultants extends Millers {
	private double consultantWage;

	/**
	 * This portion of your code constructs an hourly paid consultant with a given
	 * name and biweekly wage.
	 * 
	 * @param name the name of this consultant
	 * @param wage the consultant wage per hour
	 */
	public Consultants(String name, double consultantWage) {
		setName(name);
		this.consultantWage = consultantWage;
	}

	/**
	 * This portion of code computes the bi-weekly pay of work done by the
	 * consultant.
	 * 
	 * @param hoursWorked the number of hours worked bi-weekly
	 * @return the pay for the given number of hours
	 */
	@Override
	public double biWeeklyPay(int hoursWorked) {
		double pay = hoursWorked * consultantWage;
		if (hoursWorked > 76) {
			pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
		}
		return pay;
	}
}
