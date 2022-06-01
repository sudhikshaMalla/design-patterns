package behaviouralPatterns.statePattern;

public class GreenState implements State{
    TrafficSignal signal;

    public GreenState(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void transitionTo(State state) {
        this.signal.setCurrentState(state);
    }

    @Override
    public void displayInstruction() {
        System.out.println("GREEN LIGHT ON: Go!!");
    }
}