package course02.lesson07.transport;

import course02.lesson07.driver.Driver;
import course02.lesson07.mechanic.Mechanic;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    public ArrayList<Driver> drivers;
    public ArrayList<Mechanic> mechanics;
    private int mechanicQuantity;
    private int driverQuantity;
    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity) {
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
        setDriverQuantity(driverQuantity);
    }

    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
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
        setDriverQuantity(driverQuantity);
        this.mechanics = mechanics;
    }

    public Transport(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
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
        setDriverQuantity(driverQuantity);
        this.mechanics = mechanics;
        this.drivers = drivers;
    }

    public int getDriverQuantity() {
        return driverQuantity;
    }

    public void setDriverQuantity(int driverQuantity) {
        if (driverQuantity == 1) {
            this.driverQuantity = driverQuantity;
        } else {
            throw new IndexOutOfBoundsException("One vehicle have only one driver");
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

    public abstract void getInformationAboutDriverAndMechanic(ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers);

    public abstract void fixTheVehicle();

    public abstract void carryOutTechnicalService();



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
