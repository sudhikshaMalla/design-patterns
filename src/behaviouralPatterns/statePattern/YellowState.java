package behaviouralPatterns.statePattern;

public class YellowState implements State{
    TrafficSignal signal;

    public YellowState(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void transitionTo(State state) {
        this.signal.setCurrentState(state);
    }

    @Override
    public void displayInstruction() {
        System.out.println("YELLOW LIGHT ON: Wait!!");
    }
}