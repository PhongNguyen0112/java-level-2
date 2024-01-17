/**
 * The `Invoice` class implements the `Payme` interface and represents an
 * invoice with details such as part number, part description, quantity, and
 * price per item. It provides methods to set and retrieve these details,
 * calculates the payment amount, and generates a string representation of the
 * invoice.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 * @see Payme
 */
public class Invoice implements Payme {

	/**
	 * The part number of the invoice.
	 */
	private String partNumber;

	/**
	 * The part description of the invoice.
	 */
	private String partDescription;

	/**
	 * The quantity of items in the invoice.
	 */
	private int quantity;

	/**
	 * The price per item in the invoice.
	 */
	private double pricePerItem;

	/**
	 * Constructs an `Invoice` object with specified part number, part description,
	 * quantity, and price per item.
	 * 
	 * @param part        The part number of the invoice.
	 * @param description The part description of the invoice.
	 * @param count       The quantity of items in the invoice.
	 * @param price       The price per item in the invoice.
	 */
	public Invoice(String part, String description, int count, double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count);
		setPricePerItem(price);
	}

	/**
	 * Sets the part number of the invoice.
	 * 
	 * @param part The new part number of the invoice.
	 */
	public void setPartNumber(String part) {
		partNumber = part;
	}

	/**
	 * Gets the part number of the invoice.
	 * 
	 * @return The part number of the invoice.
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the part description of the invoice.
	 * 
	 * @param description The new part description of the invoice.
	 */
	public void setPartDescription(String description) {
		partDescription = description;
	}

	/**
	 * Gets the part description of the invoice.
	 * 
	 * @return The part description of the invoice.
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * Sets the quantity of items in the invoice.
	 * 
	 * @param count The new quantity of items in the invoice.
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count;
	}

	/**
	 * Gets the quantity of items in the invoice.
	 * 
	 * @return The quantity of items in the invoice.
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the price per item in the invoice.
	 * 
	 * @param price The new price per item in the invoice.
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price;
	}

	/**
	 * Gets the price per item in the invoice.
	 * 
	 * @return The price per item in the invoice.
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * Returns a string representation of the `Invoice` object.
	 * 
	 * @return The string representation of the `Invoice` object.
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(),
				getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
	}

	/**
	 * Implements the `getPaymentAcount` method from the `Payme` interface.
	 * Calculates and returns the payment amount for the invoice.
	 * 
	 * @return The payment amount for the invoice.
	 */
	@Override
	public double getPaymentAcount() {
		return getQuantity() * getPricePerItem();
	}
}