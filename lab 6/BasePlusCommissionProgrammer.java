/**
 * The `BasePlusCommissionProgrammer` class extends the `CommissionProgrammer` class and represents a programmer
 * whose payment is based on a combination of commission and a fixed base salary. It includes details such as
 * base salary, gross sales, and commission rate, and provides methods to set and retrieve these details,
 * calculates the payment amount, and generates a string representation of the programmer.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see CommissionProgrammer
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {

    /**
     * The base salary of the base-plus commission programmer.
     */
    private double baseSalary;

    /**
     * Constructs a `BasePlusCommissionProgrammer` object with specified first name, last name,
     * social security number, month, year, gross sales, commission rate, and base salary.
     * 
     * @param firstName           The first name of the programmer.
     * @param lastName            The last name of the programmer.
     * @param socialSecurityNumber The social security number of the programmer.
     * @param month               The month of the programmer's employment.
     * @param year                The year of the programmer's employment.
     * @param grossSales          The gross sales of the commission programmer.
     * @param commissionRate      The commission rate of the commission programmer.
     * @param baseSalary          The base salary of the base-plus commission programmer.
     * @throws IllegalArgumentException If base salary is less than 0.0.
     */
    public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month,
            int year, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    /**
     * Sets the base salary of the base-plus commission programmer.
     * 
     * @param baseSalary The new base salary of the base-plus commission programmer.
     * @throws IllegalArgumentException If base salary is less than 0.0.
     */
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    /**
     * Gets the base salary of the base-plus commission programmer.
     * 
     * @return The base salary of the base-plus commission programmer.
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Implements the `getPaymentAcount` method from the `Payme` interface.
     * Calculates and returns the total payment amount for the base-plus commission programmer.
     * 
     * @return The total payment amount for the base-plus commission programmer.
     */
    @Override
    public double getPaymentAcount() {
        return getBaseSalary() + super.getPaymentAcount();
    }

    /**
     * Returns a string representation of the `BasePlusCommissionProgrammer` object.
     * 
     * @return The string representation of the `BasePlusCommissionProgrammer` object.
     */
    @Override
    public String toString() {
        return String.format(
                "base-plus commission programmer: %s %s\n" + "social security number: %s \n"
                        + "gross sales: $%.2f; commission rate: %.2f; base salary: $%.2f",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(),
                getBaseSalary());
    }
}
