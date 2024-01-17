
/**
 * File name: TestDemo.java
 * Lab Professor: Leanne Seward
 * Due Date: 10/08/2023
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the
 * application with a method main.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since Java 17.0.7
 * @see EventSchedule
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and each
	 * one is only retained long enough to call method create report on each. No
	 * variable names were used, just new Constructor().methodCall().
	 * 
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {
		/**
		 * using output new Constructor().methodCall() for each contructor
		 */
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());
		
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());
		
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023,10).createReport());
		
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023,10,31).createReport());
	}

}
