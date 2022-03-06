package behaviouralPatterns.chainOfResponsibility;

public class BuildPhase extends Phase{
    boolean isComplete(Request request) {
        if(request.isBuilt() && nextPhase!=null) {
            return nextPhase.isComplete(request);
        }
        return false;
    }
}
