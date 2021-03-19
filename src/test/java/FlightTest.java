import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.LANCASTERBOMBER);
        flight = new Flight(plane, "RED21", "BHM","GLA", "1900" );
        passenger1 = new Passenger("Bob Edie", 1);
        passenger2 = new Passenger("Michael Farguson", 2);
        passenger3 = new Passenger("Clare Bernadette", 3);
    }

    @Test
    public void getEmptyPassengerListCount(){
        assertEquals(0, flight.getPassengerListSize());
    }

    @Test
    public void checkEmptyPlaneAvailableSeats(){
        assertEquals(4, flight.availableSeats());
    }

    @Test
    public void checkPassengerBooking(){
        flight.bookPassengerIntoFlight(passenger1);
        flight.bookPassengerIntoFlight(passenger2);
        flight.bookPassengerIntoFlight(passenger3);
        assertEquals(1, flight.availableSeats());
    }
}
