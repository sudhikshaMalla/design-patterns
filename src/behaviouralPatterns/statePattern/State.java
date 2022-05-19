package behaviouralPatterns.statePattern;

public interface State {
    void transitionTo(State state);

    void displayInstruction();
}
