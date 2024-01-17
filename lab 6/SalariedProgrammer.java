/**
 * The `SalariedProgrammer` class extends the `Programmer` class and represents a programmer
 * paid a fixed weekly salary. It includes details such as weekly salary,
 * and provides methods to set and retrieve these details, calculates the payment amount,
 * and generates a string representation of the programmer.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see Programmer
 */
public class SalariedProgrammer extends Programmer {

    /**
     * The weekly salary of the salaried programmer.
     */
    private double weeklySalary;

    /**
     * Constructs a `SalariedProgrammer` object with specified first name, last name,
     * social security number, month, year, and weekly salary.
     * 
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's employment.
     * @param year                The year of the programmer's employment.
     * @param weeklySalary        The weekly salary of the salaried programmer.
     * @throws IllegalArgumentException If weekly salary is less than 0.0.
     */
    public SalariedProgrammer(String firstName, String lastName,
            String socialSecurityNumber, int month, int year,
            double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, month, year);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    /**
     * Sets the weekly salary of the salaried programmer.
     * 
     * @param weeklySalary The new weekly salary of the salaried programmer.
     * @throws IllegalArgumentException If weekly salary is less than 0.0.
     */
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }
    /**
     * Gets the weekly salary of the salaried programmer.
     * 
     * @return The weekly salary of the salaried programmer.
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * Implements the `getPaymentAcount` method from the `Payme` interface.
     * Calculates and returns the payment amount for the salaried programmer.
     * 
     * @return The payment amount for the salaried programmer.
     */
    @Override
    public double getPaymentAcount() {
        return getWeeklySalary();
    }

    /**
     * Returns a string representation of the `SalariedProgrammer` object.
     * 
     * @return The string representation of the `SalariedProgrammer` object.
     */
    @Override
    public String toString() {
        return String.format("salaried Programmer: %s %s\n"
                + "social security number: %s \n"
                + "weekly salary: $%.2f", getFirstName(), getLastName(),
                getSocialSecurityNumber(), getWeeklySalary());
    }
}