package OOPS;

class ATMAccount
{
   private int pin;
   private double balance;
   
   public void setPin(int pin)
   {
	   this.pin=pin;
   }
   public double getBalance(int enteredPin)
   {
	   if(this.pin == enteredPin)
	   {
		   return balance;
	   }
	   else
	   {
		   System.out.println("Incorrect Pin");
		   return -1;  //Invalid Response
	   }
   }
   
   public void deposite(int enteredPin, double amount)
   {
	   if(enteredPin == pin)
	   {
		   balance = balance + amount;
		   System.out.println("Deposited :"+amount);
	   }
	   else
	   {
		   System.out.println("Wrong Pin!");
	   }
   }
   public void Withdraw(int enteredPin, double amount)
   {
	   if(enteredPin == pin)
	   {
		   balance = balance - amount;
		   System.out.println("Withdraw :"+balance);
	   }
	   else
	   {
		   System.out.println("Wrong Pin!");
	   }
   }

}

public class ATMData {

	public static void main(String[] args) {
     ATMAccount a= new ATMAccount();
     a.setPin(1111);        // set Pin
     a.deposite(1111, 54000);   //Deposited
     a.Withdraw(1111, 2000);      //Withdraw
     System.out.println("Balance is :"+a.getBalance(1111));  //check balance
     
	}

}
