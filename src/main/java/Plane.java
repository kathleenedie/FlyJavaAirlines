public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int planeCapacity(){
        return planeType.getCapacity();
    }

    public double planeTotalPlaneBaggageWeight(Plane plane) {
        double availableWeight = planeType.getTotalWeight() / 2;
        return availableWeight;
    }
}
