package behaviouralPatterns.mediatorPattern;

public class Schedule {
    private boolean[] slots = new boolean[24];

    public boolean isAvailable(int hour) {
        return !slots[hour];
    }

    public boolean isAvailable(int startHour, int endHour) {
        for(int i=startHour; i<endHour; i++) {
            if(!isAvailable(i))
                return false;
        }
        return true;
    }

    public void createAppointment(int hour) {
        slots[hour] = true;
    }

    public void createAppointment(int startHour, int endHour) {
        for(int i=startHour; i<endHour; i++) {
            createAppointment(i);
        }
    }

    public void printSchedule() {
        System.out.println("**SCHEDULE**");
        for (int i=0; i< slots.length; i++) {
            System.out.println(i + " - " + (slots[i]?"Busy":"Free"));
        }
    }
}
