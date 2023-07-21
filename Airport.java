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
   

    public ArrayList searchFlightsBySourceAndDestination(String source, String destination) {

        ArrayList matchingFlights = new ArrayList<>();

        for (Flight flight : flights) {

            if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {

                matchingFlights.add(flight);

            }

        }

        return matchingFlights;

    }

   
    public void bookTicket(String flightId, Traveller traveller) {

        for (Flight flight : flights) {

            if (flight.flightId.equalsIgnoreCase(flightId) && ( flight.getAvailableSeats() > 0)) {

                flight.availableSeats--;

                travellers.add(traveller);

                System.out.println("Ticket booked successfully for " + traveller.getName() + " on flight " + flightId);

                return;

            }

        }

        System.out.println("No available seats for flight " + flightId);

    }


 }

 