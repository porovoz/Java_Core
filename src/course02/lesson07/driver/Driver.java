package course02.lesson07.driver;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicence;
    private int drivingExperience;
    private String category;

    public Driver(String fullName, boolean driversLicence, int drivingExperience, String category) throws DriversLicenceException {
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
        setCategory(category);
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws DriversLicenceException {
        if (category == null || category.isEmpty()) {
            throw new DriversLicenceException("Driver's licence category have to be specified" +
                    " for the driver " + getFullName());
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            throw new DriversLicenceException("Driver's licence category have to be specified" +
                    " for the driver " + getFullName());
        }
    }


    @Override
    public String toString() {
        return "Driver's fullName: " + fullName + ", has drivers licence category " + category +
                ", with driving experience of: " + drivingExperience + " years";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName) && Objects.equals(category, driver.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience, category);
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelTheVehicle();
}

