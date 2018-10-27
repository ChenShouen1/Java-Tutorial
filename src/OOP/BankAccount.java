/**
* @author Aaron Smith
*/
package OOP;

public class BankAccount
{

	
	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public BankAccount() {
		this("12345", 2.50, "default name", "default address", "default phone");
		System.out.println("empty constructor");
	}
	
	public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber)
	{
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	
	public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
	}

	public void deposit(double depositAmount)
	{
		this.accountBalance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made.  New balance is " + this.accountBalance);
	}
	public void withdrawal(double withdrawalAmount)
	{
		if(this.accountBalance - withdrawalAmount < 0)
			{System.out.println("only " + this.accountBalance + " available.  Withdrawal is not processed.");}
		else
		{this.accountBalance -= withdrawalAmount;
		System.out.println("Withdrawal of " + withdrawalAmount + " processed.  Remaining balance = " + this.accountBalance);}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	

	
	
	
	
	
	
}
