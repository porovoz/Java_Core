package course02.lesson07.transport;

import course02.lesson07.driver.Driver;
import course02.lesson07.mechanic.Mechanic;
import course02.lesson07.mechanic.ProfessionalSkills;
import java.util.ArrayList;

public class Bus extends Transport implements Competitor {

    private SeatsCapacity seatsCapacity;

    public Bus() {
        super("", "", 0, 0, 1);
    }

    public Bus(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
               SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity);
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
               ArrayList<Mechanic> mechanics, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity, mechanics);
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand, String model, double engineVolume, int mechanicQuantity, int driverQuantity,
               ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, mechanicQuantity, driverQuantity, mechanics, drivers);
        this.seatsCapacity = seatsCapacity;
    }

    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
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
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("There is not enough data on bus");
        } else {
            System.out.println("Seats capacity: from " + seatsCapacity.getSeatsCapacityLowerLimit() + " seats to " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " seats");
        }
    }

    @Override
    public void passDiagnostics() {
        throw new UnsupportedOperationException("The bus " + getBrand() + ", " + getModel() + " can not be diagnosed");
    }

    @Override
    public void getInformationAboutDriverAndMechanic(ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("The bus " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is servicing by mechanic " + mechanic);
                }
            }
            for (Driver driver : drivers) {
                if (driver.getCategory().equals("D")) {
                    System.out.println("The bus " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is driven by " + driver.getFullName());
                }
            }
        }
    }

    @Override
    public void carryOutTechnicalService() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES ||
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
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.fixTheVehicle(this);
                }
            }
        }
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
