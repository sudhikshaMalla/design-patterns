package behaviouralPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {

        AffliatedCollege college1 = new AffliatedCollege();
        college1.conductExam();

        System.out.println();

        AutonomousCollege college2 = new AutonomousCollege();
        college2.conductExam();

    }
}