package course02.lesson07.transport;

import course02.lesson07.driver.Driver;
import course02.lesson07.mechanic.Mechanic;
import course02.lesson07.mechanic.ProfessionalSkills;

import java.util.ArrayList;
import java.util.Objects;

public class Truck extends Transport implements Competitor {

    private LoadCapacity loadCapacity;

    public Truck() {
        super("", "", 0, 0, 1);
    }

    public Truck(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
                 ArrayList<Mechanic> mechanics, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity, mechanics);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
                 ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity, mechanics, drivers);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("There is not enough data on truck");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : "from " +
                    loadCapacity.getLoadCapacityLowerLimit() + " tons";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " to " +
                    loadCapacity.getLoadCapacityUpperLimit() + " tons";
            System.out.println("Load capacity: " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("The truck " + getBrand() + ", " + getModel() + " is under diagnostics");
    }

    @Override
    public void getInformationAboutDriverAndMechanic(ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT
                && mechanics.size() < 3) {
                    System.out.println("The truck " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is servicing by mechanic " + mechanic);
                }
            }
            for (Driver driver : drivers) {
                if (driver.getCategory().equals("C")) {
                    System.out.println("The truck " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is driven by " + driver.getFullName());
                }
            }
        }
    }

    @Override
    public void carryOutTechnicalService() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.carryOutTechnicalService(this);
                }
            }
        }
    }

    @Override
    public void fixTheVehicle() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.fixTheVehicle(this);
                }
            }
        }
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
