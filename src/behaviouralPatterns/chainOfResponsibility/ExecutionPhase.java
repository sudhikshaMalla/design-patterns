package behaviouralPatterns.chainOfResponsibility;

public class ExecutionPhase extends Phase{
    boolean isComplete(Request request) {
        return request.isExecuted();
    }
}