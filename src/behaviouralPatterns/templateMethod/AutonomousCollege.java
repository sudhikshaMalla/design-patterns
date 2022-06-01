package behaviouralPatterns.templateMethod;

public class AutonomousCollege extends Exam{

    @Override
    void provideSeatingArrangement() {
        System.out.println("Exam Seating arrangement is given in the same college");
    }

    @Override
    void performCorrections() {
        System.out.println("Exam paper correction responsibilty is taken by same college..");
    }
}