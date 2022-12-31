package course02.lesson04.driver;

import course02.lesson04.transport.Competitor;
import course02.lesson04.transport.Transport;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicence;
    private int drivingExperience;

    public Driver(String fullName, boolean driversLicence, int drivingExperience) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";
        } else {
            this.fullName = fullName;
        }
        this.driversLicence = driversLicence;
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(boolean driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "Driver's fullName: " + fullName + ", has drivers licence: " + driversLicence +
                ", with driving experience of: " + drivingExperience + " years";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }

//    public abstract void drive();
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();
}