package behaviouralPatterns.templateMethod;

public class AffliatedCollege extends Exam{

    @Override
    void provideSeatingArrangement() {
        System.out.println("Exam Seating arrangement is given in the different colleges");
    }

    @Override
    void performCorrections() {
        System.out.println("Exam paper correction responsibilty is taken by afflication college..");
    }
}