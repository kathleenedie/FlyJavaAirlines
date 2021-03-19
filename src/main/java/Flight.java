import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destinationCode;
    private String departureCode;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String flightNumber, String destinationCode, String departureCode, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationCode = destinationCode;
        this.departureCode = departureCode;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int getPassengerListSize() {
        return this.passengers.size();
    }

    public int availableSeats() {
        int freeSeats = plane.planeCapacity() - getPassengerListSize();
        return freeSeats;
    }


    public void bookPassengerIntoFlight(Passenger passenger) {
        if(availableSeats() >= 1){
            this.passengers.add(passenger);
        }
    }
}
