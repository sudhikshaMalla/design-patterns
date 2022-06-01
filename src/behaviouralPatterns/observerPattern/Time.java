package behaviouralPatterns.observerPattern;

public class Time {

    private String date;
    private String month;
    private String year;
    private String hours;
    private String minutes;

    public Time(String date, String month, String year, String hours, String minutes) {
        this.date = date;
        this.month = month;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return date + "/" + month + "/" + year + " at " + hours + ":" + minutes + " (24 hr format)";
    }
}