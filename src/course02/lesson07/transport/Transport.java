package course02.lesson07.transport;

import course02.lesson07.driver.Driver;
import course02.lesson07.mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    protected ArrayList<Driver> drivers;
    protected ArrayList<Mechanic> mechanics;
    private int mechanicQuantity;
    private Driver driver;
    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, Driver driver) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        setMechanicQuantity(mechanicQuantity);
        if (driver != null) {
            this.driver = driver;
        }
    }

    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, Driver driver,
                     ArrayList<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        setMechanicQuantity(mechanicQuantity);
        if (driver != null) {
            this.driver = driver;
        }
        this.mechanics = mechanics;
    }

    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, Driver driver,
                     ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        setMechanicQuantity(mechanicQuantity);
        if (driver != null) {
            this.driver = driver;
        }
        this.mechanics = mechanics;
        this.drivers = drivers;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (driver != null) {
            this.driver = driver;
//        } else {
//            throw new IllegalArgumentException("The driver can not be null");
        }
    }

    public int getMechanicQuantity() {
        return mechanicQuantity;
    }

    public void setMechanicQuantity(int mechanicQuantity) {
        if (mechanicQuantity <= 0) {
            this.mechanicQuantity = 1;
        } else if (mechanicQuantity > 3) {
            throw new IndexOutOfBoundsException("Number of mechanics must be from 1 to 3");
        } else {
            this.mechanicQuantity = mechanicQuantity;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine volume: " + getEngineVolume()
                + " l.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && mechanicQuantity == transport.mechanicQuantity && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanicQuantity);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract void passDiagnostics();

    public abstract void getInformationAboutDriverAndMechanic();

    public abstract void fixTheVehicle();

    public abstract void carryOutTechnicalService();

    public abstract void addMechanicInList(Mechanic mechanic);

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public static void performDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("An error occurred");
                System.out.println(e.getMessage());
            }
        }
    }
}
