package inheritance;

interface Payment
{
   public void paymentProcess(double amount);
}

interface Notification
{
   public void sendNotification(String msg);
}

class OnlineOrder implements Payment, Notification
{
	   public void paymentProcess(double amount)
	   {
		   System.out.println("Payment of " +amount + " Payment Succcessful");
	   }
	   public void sendNotification(String msg)
	   {
		   System.out.println("Notification Send : "+ msg);
	   }
	
}

public class OnlinePaymentEx {

	public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.paymentProcess(16000.45);
        order.sendNotification("Order has been placed");
        order.sendNotification("Thank You for Shopping");
	}

}
