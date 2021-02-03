package model;

public class BankingBusinessLogic {

	// Withdrawal checking function
	public double withdrawalChecking(Banking account, double amount)
	{
		double checkingAmount = 0.0;
		checkingAmount = account.getChecking() - amount;
		return checkingAmount;
	}
	
	// Deposit checking function
	public double depositChecking(Banking account, double amount)
	{
		double checkingAmount = 0.0;
		checkingAmount = account.getChecking() + amount;
		return checkingAmount;
	}
	
	// Withdrawal savings function
	public double withdrawalSavings(Banking account, double amount)
	{
		double savingsAmount = 0.0;
		savingsAmount = account.getSavings() - amount;
		return savingsAmount;
	}
	
	// Deposit savings function
	public double depositSavings(Banking account, double amount)
	{
		double savingsAmount = 0.0;
		savingsAmount = account.getSavings() + amount;
		return savingsAmount;
	}
	
}
