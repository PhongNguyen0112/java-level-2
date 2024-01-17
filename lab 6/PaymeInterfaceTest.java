/**
 * This is the main class for the Payme system. It prompts for input of
 * different stuff worked for different roles of the programmer and prints the payment details for
 * each person.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 2023-11-16
 * @see Payme
 * @see Invoice
 * @see Programmer
 * @see SalariedProgrammer
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 */
public class PaymeInterfaceTest {
    /**
     * The main method of the PaymeInterfaceTest class. It creates an array of Payme objects,
     * populates it with different types of programmers and invoices, and then prints the payment
     * details for each person using polymorphism.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating an array of Payme objects
        Payme[] paymeobj = new Payme[6];

        // Populating the array with different types of programmers and invoices
        paymeobj[0] = new Invoice("22776", "brakes", 3, 300);
        paymeobj[1] = new Invoice("33442", "gear", 5, 90.99);
        paymeobj[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 11, 2023, 320);
        paymeobj[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 11, 2023, 18.95, 40);
        paymeobj[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 11, 2023, 16500, 0.44);
        paymeobj[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 11, 2023, 1200, 0.04, 720);

        // Printing payment details for Invoices and Programmers using polymorphism
        System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

        for (Payme currentPayme : paymeobj) {
            // Printing details for each Payme object
            System.out.printf("%s \n", currentPayme.toString());

            // Checking if the Payme object is an instance of BasePlusCommissionProgrammer
            if (currentPayme instanceof BasePlusCommissionProgrammer) {
                // Downcasting Payme reference to BasePlusCommissionProgrammer reference
                BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

                // Calculating and printing the new base salary with a 5% increase
                double oldBaseSalary = programmer.getBaseSalary();
                programmer.setBaseSalary(1.05 * oldBaseSalary);
                System.out.printf("new base salary with 5%% increase is: $%,.2f\n", programmer.getBaseSalary());
            }

            // Printing the payment due for each Payme object
            System.out.printf("Payment due: $%.2f \n", currentPayme.getPaymentAcount());
            System.out.println();
        }
    }
}
