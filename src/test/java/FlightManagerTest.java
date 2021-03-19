import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;
    Flight flight;
    Passenger passengera;
    Passenger passengerb;
    Passenger passengerc;
    FlightManager flightmanager;

    @Before
    public void before(){

        plane = new Plane(PlaneType.TWINOTTERDHC6);
        flight = new Flight(plane, "CAN8", "YYZ", "EDI", "1000");
        passengera = new Passenger("Nuala Edie", 2);
        passengerb = new Passenger("Rick Wellbanks", 1);
        passengerc = new Passenger("Sarah-Jane Judge", 6);
        flightmanager = new FlightManager();
    }

    @Test
    public void canGetTotalPlaneBaggageWeight(){
        assertEquals(200.00, plane.planeTotalPlaneBaggageWeight(plane), 0.01);
    }

    @Test
    public void canGetPassengerBaggageAllowance(){
        assertEquals(11.1111, flightmanager.passengerBaggageAllowance(plane), 0.01);
    }

    @Test
    public void checkSinglePassengerTotalBaggageWeight(){
        assertEquals(22.2222, flightmanager.singlePassengerTotalBaggageWeight(plane, passengera), 0.01);
    }

    @Test
    public void checkTotalPassengerBaggageWeight(){
        flight.bookPassengerIntoFlight(passengera);
        flight.bookPassengerIntoFlight(passengerb);
        flight.bookPassengerIntoFlight(passengerc);
        assertEquals(100, flightmanager.totalFlightBaggageWeight(flight, plane), 0.01);
    }

    @Test
    public void checkRemainingAvailableBaggageWeight(){
        flight.bookPassengerIntoFlight(passengera);
        flight.bookPassengerIntoFlight(passengerb);
        flight.bookPassengerIntoFlight(passengerc);
        assertEquals(100, flightmanager.remainingBaggageWeight(flight, plane), 0.01);
    }



}
