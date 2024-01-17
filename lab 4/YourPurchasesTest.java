
/**
 * File name: YourPurchaseTest.java
 * Author: Hong Phong Nguyen, 041099229
 * Course: CST8284 321
 * Assignment: Lab 4
 * Date: October 15th,2023
 * Professor: Leanne Seaward
 * Purpose: This class use junit4 to check method
 * Class list: YourPurchaseTest, YourPurchase
 */
import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;

	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
		Assert.assertEquals(expected, changeResult, EPSILON);
	}

	@Test
	public void testCalculateChange1() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(3.6);
		aPurchase.receivePayment(5, 4, 3, 2, 1);
		double changeResult = aPurchase.CalculateChange();
		double expected = 2.81;
		Assert.assertEquals(expected, changeResult, EPSILON);
	}

	@Test
	public void testGiveChangeWithoutPruchasing() {
		YourPurchases aPurchase = new YourPurchases();
		double giveChange = aPurchase.giveChange();
		double expected = 0.0;
		Assert.assertEquals(expected, giveChange, EPSILON);
	}

	@Test
	public void testGiveChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2);
		aPurchase.receivePayment(5, 2, 3, 1, 1);
		double giveResult = aPurchase.giveChange();
		double expected = 3.85;
		Assert.assertEquals(expected, giveResult, EPSILON);
	}

	@Test
	public void testGetPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(3.6);
		double changeResult = aPurchase.getPurchase();
		double expected = 3.6;
		Assert.assertEquals(expected, changeResult, EPSILON);
	}

	@Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 4, 3, 2, 1);
		double paymentResult = aPurchase.getPayment();
		double expected = 6.41;
		Assert.assertEquals(expected, paymentResult, EPSILON);
	}

	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(10);
		aPurchase.recordPurchase(20);
		double giveResult = aPurchase.getPurchase();
		double expected = 30;
		Assert.assertEquals(expected, giveResult, EPSILON);
	}

	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(1, 2, 3, 4, 5);
		double paymentResult = aPurchase.getPayment();
		double expectedPayment = 2.05;
		Assert.assertEquals(expectedPayment, paymentResult, EPSILON);
	}
}