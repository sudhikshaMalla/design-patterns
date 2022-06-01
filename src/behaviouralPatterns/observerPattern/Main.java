package behaviouralPatterns.observerPattern;

import behaviouralPatterns.observerPattern.observers.Observer;
import behaviouralPatterns.observerPattern.observers.Student;
import behaviouralPatterns.observerPattern.subjects.Club;
import behaviouralPatterns.observerPattern.subjects.Subject;

public class Main {
    public static void main(String[] args) {

        Observer s1 = new Student("Mary");
        Observer s2 = new Student("Alex");
        Observer s3 = new Student("Nancy");
        Observer s4 = new Student("Steve");
        Observer s5 = new Student("Susan");

        Subject c1 = new Club("Cultural Club");
        Subject c2 = new Club("Coding Club");

        c1.addObserver(s1);
        c1.addObserver(s2);

        c2.addObserver(s3);
        c2.addObserver(s4);
        c2.addObserver(s5);

        Event e1 = new Event("Live Music Concert", new Time("01","05","2022", "19", "00"),
                new Time("01","05","2022", "21", "30"),500);

        Event e2 = new Event("Inventron", new Time("03","05","2022", "09", "00"),
                new Time("05","05","2022", "09", "30"),500);


        c1.addEvent(e1);
        System.out.println();
        c2.addEvent(e2);
        System.out.println();
        c1.addEvent(e2);
    }
}