package course02.lesson06.transport;

public class Car extends Transport implements Competitor {
    private BodyType bodyType;

    public Car() {
        super("", "", 0);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
        System.out.println("The car is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("The car is stopping");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("There is not enough data on car");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("The car " + getBrand() + ", " + getModel() + " is under diagnostics");
    }

    @Override
    public void pitStop() {
        System.out.println("Your car should drive to a pit-stop");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Best car lap time is: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Maximum car speed is: ");
    }
}
