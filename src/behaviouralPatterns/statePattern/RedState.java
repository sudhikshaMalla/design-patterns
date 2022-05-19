package behaviouralPatterns.statePattern;

public class RedState implements State{

    TrafficSignal signal;

    public RedState(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void transitionTo(State state) {
        this.signal.setCurrentState(state);
    }

    @Override
    public void displayInstruction() {
        System.out.println("RED LIGHT ON: Stop!!");
    }
}