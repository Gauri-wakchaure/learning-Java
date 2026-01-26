package constructor;

class Busticket
{
	String passengerName;
	String destination;
	int ticketno;
	
	public Busticket(String passengerName, String destination, int ticketno)
	{
		this.passengerName=passengerName;
		this.destination=destination;
		this.ticketno=ticketno;
	}
	
	
}
public class Parameterized {

	public static void main(String[] args) {
       Busticket b = new Busticket("Gauri" , "Pune", 10);
       System.out.println("Passenger :" +b.passengerName);
       System.out.println("Destination :" +b.destination);
       System.out.println("TicketNo :" +b.ticketno);

	}

}
