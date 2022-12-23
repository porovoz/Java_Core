package course02.lesson04.transport;

public class Truck extends Transport implements Competitor {

    public Truck() {
        super("", "", 0);
    }
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
