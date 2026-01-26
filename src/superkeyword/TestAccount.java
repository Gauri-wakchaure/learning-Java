package superkeyword;

class BankAccount
{
  String bankName ="State Bank of India";	
  
  public BankAccount()
  {
		System.out.println("Bank Account constructor called");

  }
  
  public void displayAccountType()
  {
		System.out.println("AccountType :General Bank account");

  }
}

class SavingAccount extends BankAccount
{
	String bankName ="HDFC";
	public SavingAccount()
	{   
		super.displayAccountType();
		System.out.println("Saving Account constructor called");

	}
	public void displayDetails()
	{
		System.out.println("Child Bank Name :"+bankName);
		System.out.println("Parent Bank Name :"+super.bankName);

	}
}

public class TestAccount {

	public static void main(String[] args) {
    SavingAccount s = new SavingAccount();
    s.displayDetails();
    
	}

}
