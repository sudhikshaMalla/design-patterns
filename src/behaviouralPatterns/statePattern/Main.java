package behaviouralPatterns.statePattern;

public class Main {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        signal.displayStateInstruction();

        signal.changeState();
        signal.displayStateInstruction();

        signal.changeState();
        signal.displayStateInstruction();

        signal.changeState();
        signal.displayStateInstruction();

        signal.changeState();
        signal.displayStateInstruction();
    }
}