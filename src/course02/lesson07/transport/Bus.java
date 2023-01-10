package course02.lesson07.transport;

public class Bus extends Transport implements Competitor {

    private SeatsCapacity seatsCapacity;

    public Bus() {
        super("", "", 0);
    }
    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume);
        this.seatsCapacity = seatsCapacity;
    }

    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
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
        System.out.println("The bus is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("The bus is stopping");
    }

    @Override
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("There is not enough data on bus");
        } else {
            System.out.println("Seats capacity: from " + seatsCapacity.getSeatsCapacityLowerLimit() + " seats to " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " seats");
        }
    }

    @Override
    public void passDiagnostics() {
        throw new UnsupportedOperationException("The bus " + getBrand() + ", " + getModel() + " can not be diagnosed");
    }

    @Override
    public void pitStop() {
        System.out.println("Your bus should drive to a pit-stop");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Best bus lap time is: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Maximum bus speed is: ");
    }
}
