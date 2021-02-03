package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Banking;
import model.BankingBusinessLogic;

public class TestSavingsLogic {
	BankingBusinessLogic banking = new BankingBusinessLogic();
	Banking account = new Banking("John Smith");
	
	@Before
	public void setUp() throws Exception {
	}

	// Assert withdrawal equals
	@Test
	public void testWithdrawalSavingsEquals() {
		account.setSavings(2000);
		double savingsAmount = banking.withdrawalSavings(account, 500);
		assertEquals(1500, savingsAmount, 0.0);
	}
	
	// Assert deposit equals
	@Test
	public void testDepositSavingsEquals() {
		account.setSavings(2000);
		double savingsAmount = banking.depositSavings(account, 1000);
		assertEquals(3000, savingsAmount, 0.0);
	}
	
	// Assert withdrawal not null
	@Test 
	public void testWithdrawalSavingsNotNull()
	{
		account.setChecking(1000);
		double checkingAmount = banking.withdrawalChecking(account, 500);
		assertNotNull(checkingAmount);
	}
	
	// Assert deposit false
	@Test
	public void testDepositSavingsFalse()
	{
		account.setChecking(0);
		double checkingAmount = banking.depositChecking(account, 500);
		assertFalse(checkingAmount == 1000);
	}
	
	// Assert withdrawal true
	@Test
	public void testWithdrawalSavingsTrue()
	{
		account.setChecking(1000);
		double checkingAmount = banking.withdrawalChecking(account, 0);
		assertTrue(checkingAmount == 1000);
	}
	
}
