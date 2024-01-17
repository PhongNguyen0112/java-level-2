/**
 * The `Payme` interface declares a single method, `getPaymentAcount`, that must be implemented
 * by classes or interfaces that implement it. This interface represents entities capable of
 * providing information about their payment amount.
 * 
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 11/16/2023
 */
public interface Payme {

    /**
     * Gets the payment amount for the implementing class.
     * 
     * @return The payment amount for the implementing class.
     */
    public double getPaymentAcount();
}
