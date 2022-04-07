package behaviouralPatterns.mediatorPattern;

public class PersonalAssisstant {
    private String name;
    private String bossName;
    private Schedule bossSchedule;

    public PersonalAssisstant(String name, CEO boss) {
        this.name = name;
        this.bossSchedule = new Schedule();
        this.bossName = boss.getName();
        boss.setAssisstant(this);
    }

    public String getName() {
        return name;
    }

    public boolean checkAvailability(int hour) {
        boolean availability_status = bossSchedule.isAvailable(hour);
        if(availability_status == true)
            System.out.println("Slot available at " + hour + ":00 hrs today.");
        else
            System.out.println("Slot not available at " + hour + ":00 hrs today.");
        return availability_status;
    }

    public boolean checkAvailability(int startHour, int endHour) {
        boolean availability_status = bossSchedule.isAvailable(startHour, endHour);
        if(availability_status == true)
            System.out.println("Slot available from " + startHour + ":00 hrs to " + endHour + ":00 hrs today.");
        else
            System.out.println("Slot not available from " + startHour + ":00 hrs to " + endHour + ":00 hrs today.");
        return availability_status;
    }

    public void fixAppointment(int hour) {
        if(checkAvailability(hour)) {
            bossSchedule.createAppointment(hour);
            System.out.println("Appointment confirmed!!");
        }
        else {
            System.out.println("Appointment cannot be confirmed!!");
        }
    }

    public void fixAppointment(int startHour, int endHour) {
        if(checkAvailability(startHour, endHour)) {
            bossSchedule.createAppointment(startHour, endHour);
            System.out.println("Appointment confirmed!!");
        }
        else {
            System.out.println("Appointment cannot be confirmed!!");
        }
    }

    public void displayBossSchedule() {
        bossSchedule.printSchedule();
    }
}
