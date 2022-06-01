package behaviouralPatterns.chainOfResponsibility;

public class LogPhase extends Phase{
    boolean isComplete(Request request) {
        if(request.isLogged() && nextPhase!=null) {
            return nextPhase.isComplete(request);
        }
        return false;
    }
}