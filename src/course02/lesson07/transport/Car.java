package course02.lesson07.transport;

import course02.lesson07.driver.Driver;
import course02.lesson07.driver.DriverB;
import course02.lesson07.mechanic.Mechanic;
import course02.lesson07.mechanic.ProfessionalSkills;

import java.util.ArrayList;
import java.util.Objects;

public class Car extends Transport implements Competitor {

    private BodyType bodyType;

    public Car() {
        super("", "", 0, 0, null);
    }

    public Car(String brand, String model, double engineVolume, int mechanicQuantity, DriverB driver,
               BodyType bodyType) {
        super(brand, model, engineVolume, mechanicQuantity, driver);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume, int mechanicQuantity, DriverB driver,
               ArrayList<Mechanic> mechanics, BodyType bodyType) {
        super(brand, model, engineVolume, mechanicQuantity, driver, mechanics);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume, int mechanicQuantity, DriverB driver,
               ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, BodyType bodyType) {
        super(brand, model, engineVolume, mechanicQuantity, driver, mechanics, drivers);
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
    public void getInformationAboutDriverAndMechanic() {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("The car " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is servicing by mechanic " + mechanic);
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(driver.getFullName(), getDriver().getFullName())) {
                    System.out.println("The car " + getBrand() + " " + getModel() + ", with engine volume "
                            + getEngineVolume() + " l. is driven by " + driver.getFullName());
                }
            }
        } else {
            System.out.println("There is no driver and mechanics for this car");
        }
    }

    @Override
    public void carryOutTechnicalService() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS ||
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
                if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.fixTheVehicle(this);
                }
            }
        }
    }

    @Override
    public void addMechanicInList(Mechanic mechanic) {
            if (mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS ||
                    mechanic.getProfessionalSkills() == ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT) {
                mechanics.add(mechanic);
            }
        System.out.println(mechanics);
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
