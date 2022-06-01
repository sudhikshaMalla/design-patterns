package behaviouralPatterns.chainOfResponsibility;

public class RequestHandler {
    private Phase initialPhase;

    public RequestHandler() {
        Phase buildPhase = new BuildPhase();
        Phase logPhase = new LogPhase();
        Phase validationPhase = new ValidationPhase();
        Phase executionPhase = new ExecutionPhase();

        buildPhase.setNextPhase(logPhase);
        logPhase.setNextPhase(validationPhase);
        validationPhase.setNextPhase(executionPhase);

        initialPhase = buildPhase;
    }

    public boolean isRequestComplete(Request request) {
        return initialPhase.isComplete(request);
    }
}
