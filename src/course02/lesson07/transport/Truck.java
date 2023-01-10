package course02.lesson07.transport;

public class Truck extends Transport implements Competitor {

    private LoadCapacity loadCapacity;

    public Truck() {
        super("", "", 0);
    }
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void startMoving() {
        System.out.println("The truck is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("The truck is stopping");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("There is not enough data on truck");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : "from " +
                    loadCapacity.getLoadCapacityLowerLimit() + " tons";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " to " +
                    loadCapacity.getLoadCapacityUpperLimit() + " tons";
            System.out.println("Load capacity: " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("The truck " + getBrand() + ", " + getModel() + " is under diagnostics");
    }

    @Override
    public void pitStop() {
        System.out.println("Your truck should drive to a pit-stop");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Best truck lap time is: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Maximum truck speed is: ");
    }
}
