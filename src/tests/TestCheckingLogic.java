package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Banking;
import model.BankingBusinessLogic;

public class TestCheckingLogic {
	BankingBusinessLogic banking = new BankingBusinessLogic();
	Banking account = new Banking("John Smith");
	
	@Before
	public void setUp() throws Exception {
	}

	// Assert withdrawal equals
	@Test
	public void testWithdrawalChecking() {
		account.setChecking(1000);
		double checkingAmount = banking.withdrawalChecking(account, 400);
		assertEquals(600, checkingAmount, 0.0);
	}

	// Assert deposit equals
	@Test
	public void testDepositChecking() {
		account.setChecking(1000);
		double checkingAmount = banking.depositChecking(account, 500);
		assertEquals(1500, checkingAmount, 0.0);
	}
	
	// Assert withdrawal not null
	@Test 
	public void testWithdrawalCheckingNotNull()
	{
		account.setChecking(1000);
		double checkingAmount = banking.withdrawalChecking(account, 500);
		assertNotNull(checkingAmount);
	}
	
	// Assert deposit false
	@Test
	public void testDepositCheckingFalse()
	{
		account.setChecking(0);
		double checkingAmount = banking.depositChecking(account, 500);
		assertFalse(checkingAmount == 1000);
	}
	
	// Assert withdrawal true
	@Test
	public void testWithdrawalCheckingTrue()
	{
		account.setChecking(1000);
		double checkingAmount = banking.withdrawalChecking(account, 0);
		assertTrue(checkingAmount == 1000);
	}
	
}
