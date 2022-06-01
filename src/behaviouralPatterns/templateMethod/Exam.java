package behaviouralPatterns.templateMethod;

public abstract class Exam {

    final void conductExam() {
        openRegistrations();
        provideSeatingArrangement();
        issueHalltickets();
        startExam();
        performCorrections();
        issueResults();
    }

    void openRegistrations() {
        System.out.println("Regristrations open for students to register...");
    }

    abstract void provideSeatingArrangement();

    void issueHalltickets() {
        System.out.println("Issued halltickets for students..");
    }

    void startExam() {
        System.out.println("Started the Exam.. Issued Question Paper and answer sheets...");
    }

    abstract void performCorrections();

    void issueResults() {
        System.out.println("Issued the exam results of the students!!");
    }

}