public class FlightManager {

    public FlightManager() {

    }

    public double passengerBaggageAllowance(Plane plane) {
        double baggageAllowance = plane.planeTotalPlaneBaggageWeight(plane) / plane.planeCapacity();
        return baggageAllowance;
    }

    public double singlePassengerTotalBaggageWeight(Plane plane, Passenger passenger) {
        double totalWeight = passengerBaggageAllowance(plane) * passenger.getNumberOfBags();
        return totalWeight;
    }

    public double totalFlightBaggageWeight(Flight flight, Plane plane) {
        double totalFlightBookedBaggage = 0;

        for(Passenger passenger : flight.getPassengers()){
            totalFlightBookedBaggage = totalFlightBookedBaggage + singlePassengerTotalBaggageWeight(plane, passenger);
        }
        return totalFlightBookedBaggage;
    }

    public double remainingBaggageWeight(Flight flight, Plane plane) {
        double weightAvailable = passengerBaggageAllowance(plane) - totalFlightBaggageWeight(flight, plane);
        return weightAvailable;
    }
}
