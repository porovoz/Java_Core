package course02.lesson05.driver;

import course02.lesson05.transport.Competitor;
import course02.lesson05.transport.Transport;

public class DriverC <T extends Transport & Competitor> extends Driver {
    public DriverC() {
        super("", true, 0);
    }

    public DriverC(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience);
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

    public void drive(T transport) {
        System.out.println("The driver: " + getFullName() + " is driving the vehicle: " + transport.getBrand() + " " +
                transport.getModel() + " and will participate in the race");
    }

    @Override
    public void startMoving() {
        System.out.println("Driver with 'C' category driving licence is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Driver with 'C' category driving licence is stopping");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Driver with 'C' category driving licence is refuelling a vehicle");
    }
}
