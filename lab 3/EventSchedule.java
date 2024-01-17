import java.util.Calendar;

/**
 * File name: EventSchedule.java
 * Lab Professor: Leanne Seward
 * Due Date: 10/08/2023
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Hong Phong Nguyen. 
 */

/**
 * This class is named EventSchedule Class. It shows constructor chaining using
 * keyword "this". In this code, the simpler constructors all call the more
 * complex one, thereby chaining the calls 'UPWARDS' (from the default
 * constructor to the one with the most arguments. Ensure that you implement it
 * in this order).
 * 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in
 * them, for demonstration purposes only. DO NOT PUT input / output into
 * constructors in real production code!!!
 * 
 * @see
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;

	/**
	 * month component of the date of
	 */
	private int month;

	/**
	 * day component of the date of
	 */
	private int day;
	/**
	 * create object named calendar - follow the link:
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html Title:Class
	 * Calendar
	 */
	static Calendar calendar = Calendar.getInstance();

	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		this(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
		System.out.println("EventSchedule() was called");
	}

	/**
	 * This constructor sets the year as passed, month to current month, and day to
	 * current day.
	 * 
	 * @param year The year of this EventSchedule.
	 */

	public EventSchedule(int year) {
		this(year, calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
		System.out.println("EventSchedule(int) was called");
	}

	/**
	 * This constructor sets the year as passed, month as passed, and day to current
	 * day.
	 * 
	 * @param year  The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */

	public EventSchedule(int year, int month) {
		this(year, month, calendar.get(Calendar.DATE));
		System.out.println("EventSchedule(int,int) was called");
	}

	/**
	 * 
	 * This constructor sets the year as passed, month as passed, and day as passed.
	 * 
	 * @param year  The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day   of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		System.out.println("EventSchedule(int, int, int) was called");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * Returns the year for this EventSchedule.
	 * 
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}

	/**
	 * Sets the year for this EventSchedule.
	 * 
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}

	/**
	 * Returns true if this EventSchedule is hybrid, false if it is not.
	 * 
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month state for this EventSchedule.
	 * 
	 * @param month this is the month to set for EventSchedule.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * day of this Orange in EventSchedule.
	 * 
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}

	/**
	 * Sets the day of this EventSchedule.
	 * 
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}

	/**
	 * make a report of eventschedule with year,month,day separated by a comma
	 * 
	 * @return A String representation of this EventSchedule, each field is
	 *         separated by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n", year, month, day);
	}
}
