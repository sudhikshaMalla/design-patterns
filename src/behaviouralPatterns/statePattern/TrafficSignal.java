package behaviouralPatterns.statePattern;

import java.util.HashMap;
import java.util.Map;

public class TrafficSignal {

    private Map<State, State> nextStates = new HashMap<>();

    private State currentState;

    public TrafficSignal() {

        State redState = new RedState(this);
        State yellowState = new YellowState(this);
        State greenState = new GreenState(this);

        this.currentState = redState;

        nextStates.put(redState, yellowState);
        nextStates.put(yellowState, greenState);
        nextStates.put(greenState, redState);

    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void displayStateInstruction() {
        currentState.displayInstruction();
    }

    public void changeState() {
        currentState.transitionTo(nextStates.get(currentState));
    }
}