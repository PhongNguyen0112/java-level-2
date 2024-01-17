
public class Test {
	public static void main(String[] args) {
		YourPurchases test = new YourPurchases();
		test.recordPurchase(10);
		test.receivePayment(5, 2, 3, 1, 1);
		double giveResult = test.giveChange();
		System.out.println(giveResult);
	}
}
