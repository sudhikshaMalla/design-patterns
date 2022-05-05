package behaviouralPatterns.observerPattern.observers;

public class Student implements Observer{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}