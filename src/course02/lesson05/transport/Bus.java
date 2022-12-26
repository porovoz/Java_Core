package course02.lesson05.transport;

public class Bus extends Transport implements Competitor {
    public Bus() {
        super("", "", 0);
    }
    public Bus(String brand, String model, double engineVolume) {
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
        System.out.println("The bus is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("The bus is stopping");
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
