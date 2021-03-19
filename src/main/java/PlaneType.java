public enum PlaneType {

    BOEING747(300, 1800),
    TWINOTTERDHC6(18, 400),
    LANCASTERBOMBER(4, 20);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
