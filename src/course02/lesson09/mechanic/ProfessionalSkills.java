package course02.lesson09.mechanic;

public enum ProfessionalSkills {
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES("bus"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS("car"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS("truck"),
    PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT("all transport");
    private final String ProfessionalSkills;

    ProfessionalSkills(String professionalSkills) {
        ProfessionalSkills = professionalSkills;
    }

    public String getProfessionalSkills() {
        return ProfessionalSkills;
    }

    @Override
    public String toString() {
        return ProfessionalSkills;
    }
}
