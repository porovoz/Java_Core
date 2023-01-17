package course02.lesson09.driver;

import course02.lesson09.transport.Competitor;
import course02.lesson09.transport.Transport;

public class DriverD <T extends Transport & Competitor> extends Driver {
    public DriverD() {
        super("", true, 0, "");
    }
    public DriverD(String fullName, boolean driversLicence, int drivingExperience, String category) {
        super(fullName, driversLicence, drivingExperience, category);
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
        System.out.println("The driver " + getFullName() + " with driver's licence category " + getCategory() +
                " is driving the vehicle " + transport.getBrand() + " " + transport.getModel() +
                " and will participate in the race");
        transport.printType();
    }

    @Override
    public void startMoving() {
        System.out.println("Driver with " + getCategory() + " category driving licence is starting to move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Driver with " + getCategory() + " category driving licence is stopping");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Driver with " + getCategory() + " category driving licence is refuelling a vehicle");
    }
}
