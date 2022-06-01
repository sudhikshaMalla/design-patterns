package behaviouralPatterns.mediatorPattern;

public class CEO {
    private String name;
    private PersonalAssisstant assisstant;

    public CEO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAssisstant(PersonalAssisstant assisstant) {
        this.assisstant = assisstant;
    }

    public boolean isAppointmentScheduled(int hour) {
        if(assisstant == null) {
            throw new RuntimeException("There is no Personal Assisstant hired to manage schedule");
        }
        return !assisstant.checkAvailability(hour);
    }

    public boolean isAppointmentScheduled(int startHour, int endHour) {
        if(assisstant == null) {
            throw new RuntimeException("There is no Personal Assisstant hired to manage schedule");
        }
        return !assisstant.checkAvailability(startHour, endHour);
    }

    public void fixPersonalAppointment(int hour) {
        assisstant.fixAppointment(hour);
    }

    public void fixPersonalAppointment(int startHour, int endHour) {
        assisstant.fixAppointment(startHour, endHour);
    }

    public void displayMySchedule() {
        if(assisstant == null) {
            throw new RuntimeException("There is no Personal Assisstant hired to manage schedule");
        }
        assisstant.displayBossSchedule();
    }
}
