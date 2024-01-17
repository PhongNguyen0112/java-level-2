/**
 * The abstract class `Programmer` implements the `Payme` interface and serves as
 * the base class for different types of programmers. It provides common functionality
 * and attributes for all programmer types.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see Payme
 */
public abstract class Programmer implements Payme {

	/**
     * The first name of the programmer.
     */
    private String firstName;

    /**
     * The last name of the programmer.
     */
    private String lastName;

    /**
     * The social security number of the programmer.
     */
    private String socialSecurityNumber;

    /**
     * The month of the programmer's employment.
     */
    private int month;

    /**
     * The year of the programmer's employment.
     */
    private int year;

    /**
     * Three-argument constructor to initialize a Programmer object.
     * 
     * @param first                The first name of the programmer.
     * @param last                 The last name of the programmer.
     * @param ssn                  The social security number of the programmer.
     * @param month                The month of the programmer's employment.
     * @param year                 The year of the programmer's employment.
     */
    public Programmer(String first, String last, String ssn, int month, int year) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        this.month = month;
        this.year = year;
    }

    /**
     * Gets the first name of the programmer.
     * 
     * @return The first name of the programmer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the programmer.
     * 
     * @param firstName The new first name of the programmer.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the programmer.
     * 
     * @return The last name of the programmer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the programmer.
     * 
     * @param lastName The new last name of the programmer.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the social security number of the programmer.
     * 
     * @return The social security number of the programmer.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the social security number of the programmer.
     * 
     * @param socialSecurityNumber The new social security number of the programmer.
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Gets the month of the programmer's employment.
     * 
     * @return The month of the programmer's employment.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the year of the programmer's employment.
     * 
     * @return The year of the programmer's employment.
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a string representation of the Programmer object.
     * 
     * @return The string representation of the Programmer object.
     */
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %s\n%s: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    /**
     * This method is declared as abstract to be implemented by subclasses.
     * It returns the payment amount for the programmer.
     * 
     * @return The payment amount for the programmer.
     */
    public abstract double getPaymentAcount();
    /**
     * My answer is: this class has no implementation on the method from Payme so the only way is make this class being abtract
     * And change the name from earning to getPaymentAcount because both of them is doing the same thing so i change the name to be like the name in Payme interface class
     * Also, when i change to getPaymentAcount i only have to implement on getPaymentAcount for other class instead of implementing both earning() and getPaymentAcount method()
     */
}