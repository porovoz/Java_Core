package course02.lesson08.mechanic;

import course02.lesson08.transport.Transport;

import java.util.Objects;

public class Mechanic {
    private final String firstName;
    private final String lastName;
    private String company;
    private final ProfessionalSkills professionalSkills;

    public Mechanic(String firstName, String lastName, String company, ProfessionalSkills professionalSkills) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "Ivan";
        } else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "Ivanov";
        } else {
            this.lastName = lastName;
        }
        setCompany(company);
        this.professionalSkills = professionalSkills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            this.company = "Texaco";
        } else {
            this.company = company;
        }
    }

    public ProfessionalSkills getProfessionalSkills() {
        return professionalSkills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && professionalSkills == mechanic.professionalSkills;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, professionalSkills);
    }

    @Override
    public String toString() {
        return "Mechanic " + firstName + " " + lastName + " works for the company " + company +
                " and can work with such vehicles as: " + professionalSkills;
    }

    public void fixTheVehicle(Transport transport) {
        System.out.println("Mechanic " + firstName + " " + lastName +
                " is fixing the " + professionalSkills + ", " + transport.getBrand() + " " + transport.getModel());
    }

    public void carryOutTechnicalService(Transport transport) {
        System.out.println("Mechanic " + firstName + " " + lastName +
                " is carrying out technical service of the " + professionalSkills + ", " + transport.getBrand()
                + " " + transport.getModel());
    }
}
