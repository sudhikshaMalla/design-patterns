package behaviouralPatterns.observerPattern;

public class Event {

    private String name;
    private Time startTime;
    private Time endTime;
    private int registrationFee;

    public Event(String name, Time startTime, Time endTime, int registrationFee) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.registrationFee = registrationFee;
    }

    @Override
    public String toString() {
        return  "Event Name : " + name +
                " | Starts At : " + startTime.toString() +
                " | Ends At : " + endTime.toString() +
                " | Registration Fee : Rs. " + registrationFee + " /- per head.";
    }
}