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
    }
}
