package FlightDemo;
import java.util.ArrayList;
import java.util.Date;
public class Airport extends Traveller
{

    Address adress;

    private ArrayList<Flight> flights;

    private ArrayList<Traveller> travellers;

    private String source;

    private String destination;

    private int availabletickets;
    
    public Airport(String name, double mobile, String email, String flightId, Date date, Address adress,
			ArrayList<Flight> flights, ArrayList<Traveller> travellers, String source, String destination,
			int availabletickets) {
		super(name, mobile, email, flightId, date);
		this.adress = adress;
		this.flights = flights;
		this.travellers = travellers;
		this.source = source;
		this.destination = destination;
		this.availabletickets = availabletickets;
	}

    public String getSource() {

        return source;

    }

    public String getDestination() {

        return destination;

    }
    public boolean addFlight(Flight flight)

        {   flights.add(flight);

            return true;

        }
    public boolean searchFlight(String source,String destination)
    {

        if(flights.contains(source) && flights.contains(destination))

            return true;

        return false;
      }

    public void bookTickets(Traveller traveller)

    {

        if(availabletickets==0)

            System.out.println("we can not book the tickets ");

        else

            travellers.add(traveller);
    }

 }

