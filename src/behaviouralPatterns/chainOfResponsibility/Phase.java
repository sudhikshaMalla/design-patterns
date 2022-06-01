package behaviouralPatterns.chainOfResponsibility;

public abstract class Phase {
    abstract boolean isComplete(Request request);

    protected Phase nextPhase;

    public void setNextPhase(Phase nextPhase) {
        this.nextPhase = nextPhase;
    }
}
