package behaviouralPatterns.chainOfResponsibility;

public class ValidationPhase extends Phase{
    boolean isComplete(Request request) {
        if(request.isValidated() && nextPhase!=null) {
            return nextPhase.isComplete(request);
        }
        return false;
    }
}