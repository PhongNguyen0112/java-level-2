/**
 * File name: MyHealthData.java
 * Lab Professor: Leanne Seward
 * Due Date: 10/15/2023
 * This file is used for designed to store and manage health-related data for a patient
 */

/**
 * This system maintains important health information about a patient.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 * @see MyHealthDataBase
 */
package assign1;

public class MyHealthData extends MyHealthDataBase {
	/**
	 * firstName of the patient
	 */
	private String firstName;
	/**
	 * lastName of the patient
	 */
	private String lastName;
	/**
	 * gender of the patient
	 */
	private String gender;
	/**
	 * the birth year of the patient
	 */
	private int birthYear;
	/**
	 * the current year right now
	 */
	private int currentYear;
	/**
	 * the height of the patient
	 */
	private double height;
	/**
	 * the weight of the patient
	 */
	private double weight;

	/**
     * Constructor to initialize the MyHealthData object with personal information.
     *
     * @param firstName   The first name of the patient.
     * @param lastName    The last name of the patient.
     * @param gender      The gender of the patient.
     * @param height      The height of the patient in centimeters.
     * @param weight      The weight of the patient in kilograms.
     * @param birthYear   The birth year of the patient.
     * @param currentYear The current year for age calculation.
     */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear,
			int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	/**
     * Get the first name of the patient.
     *
     * @return The first name.
     */
	public String getFirstName() {
		return firstName;
	}
	/**
     * Set the first name of the patient.
     *
     * @param firstName The new first name to set.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
     * Get the last name of the patient.
     *
     * @return The last name.
     */
	public String getLastName() {
		return lastName;
	}
	/**
     * Set the last name of the patient.
     *
     * @param lastName The new last name to set.
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
     * Get the gender of the patient.
     *
     * @return gender of the patient
     */
	public String getGender() {
		return gender;
	}
	/**
     * Set the gender of the patient.
     *
     * @param gender The new gender to set.
     */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
     * Get the birthYear of the patient.
     *
     * @return birthYear of the patient
     */
	public int getBirthYear() {
		return birthYear;
	}
	/**
     * Set the birthYear of the patient.
     *
     * @param birthYear The new birthYear to set.
     */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
     * Get the currentYear of the patient.
     *
     * @return currentYear of the patient
     */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
     * Set the currentYear of the patient.
     *
     * @param currentYear The new currentYear to set.
     */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
     * Get the height of the patient.
     *
     * @return height of the patient
     */
	public double getHeight() {
		return height;
	}
	/**
     * Set the height of the patient.
     *
     * @param height The new height to set.
     */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
     * Get the weight of the patient.
     *
     * @return weight of the patient
     */
	public double getWeight() {
		return weight;
	}
	/**
     * Set the weight of the patient.
     *
     * @param weight The new weight to set.
     */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
     * Calculate and return the age of the patient based on the birth year and current year.
     *
     * @return The age of the patient.
     */
	public int getAge() {
		int age = currentYear - birthYear;
		return age;
	}
	/**
     * Calculate and return the maximum heart rate of the patient using the age-based formula.
     *
     * @return The maximum heart rate.
     */
	public int maximumHeartRate() {
		return 220 - this.getAge();
	}
	/**
     * Display the patient's health data, including personal information and calculated values.
     */
	public void displayMyHealthData() {
		System.out.println("Patient's Health Data:");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Birth Year: " + birthYear);
		System.out.println("Current Year: " + currentYear);
		System.out.println("Height: " + height *2.54 + " cm");
		System.out.println("Weight: " + weight *0.5 + " kg");
		System.out.println("Age: " + this.getAge());

		double BMI = super.calculateBMI(weight, height);

		double minimumTargetHeartRate = 0.5 * this.maximumHeartRate();
		double maximumTargetHeartRate = 0.85 * this.maximumHeartRate();
		System.out.println("Maximum Heart Rate is: " + this.maximumHeartRate());
		System.out.println("Target Heart Rate Range: " + minimumTargetHeartRate + "," + maximumTargetHeartRate);
		System.out.println("BMI VALUES: " + BMI);
		if (BMI < 18.5) {
			System.out.println("Underweight: less than 18.5");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("Normal:      between 18.5 and 24.9");
		} else if (BMI >= 25 && BMI <= 29.9) {
			System.out.println("Overweight:  between 25 and 29.9");
		} else {
			System.out.println("Obese: 30 or greater");
		}
	}
}