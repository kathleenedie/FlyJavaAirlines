public class FlightManager {

    public FlightManager() {

    }

    public double passengerBaggageAllowance(Plane plane) {
        double baggageAllowance = plane.planeTotalPlaneBaggageWeight() / plane.planeCapacity();
        return baggageAllowance;
    }

    public double singlePassengerTotalBaggageWeight(Plane plane, Passenger passenger) {
        double totalWeight = passengerBaggageAllowance(plane) * passenger.getNumberOfBags();
        return totalWeight;
    }

    public double totalFlightBaggageWeight(Flight flight, Plane plane) {
        double total = 0;

        for(Passenger passenger : flight.getPassengers()){
            total += singlePassengerTotalBaggageWeight(plane, passenger);
        }
        return total;
    }

    public double remainingBaggageWeight(Flight flight, Plane plane) {
        double totalFlightWeight = totalFlightBaggageWeight(flight, plane);
        double totalPassengerWeight = passengerBaggageAllowance(plane);
        return plane.planeTotalPlaneBaggageWeight() - totalFlightBaggageWeight(flight, plane);
    }
}
