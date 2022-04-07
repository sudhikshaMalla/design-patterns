package behaviouralPatterns.mediatorPattern;

public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO("Shyam");

        PersonalAssisstant personalAssisstant = new PersonalAssisstant("Ram", ceo);

        personalAssisstant.fixAppointment(0);
        System.out.println();

        ceo.fixPersonalAppointment(6,9);
        System.out.println();

        ceo.isAppointmentScheduled(4);
        System.out.println();

        personalAssisstant.fixAppointment(7);
        System.out.println();

        ceo.displayMySchedule();
    }
}
