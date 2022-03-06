package behaviouralPatterns.chainOfResponsibility;

public class Request {
    private boolean isBuilt;
    private boolean isLogged;
    private boolean isValidated;
    private boolean isExecuted;

    public Request(boolean isBuilt, boolean isLogged, boolean isValidated, boolean isExecuted) {
        this.isBuilt = isBuilt;
        this.isLogged = isLogged;
        this.isValidated = isValidated;
        this.isExecuted = isExecuted;
    }

    public boolean isBuilt() {
        return isBuilt;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public boolean isExecuted() {
        return isExecuted;
    }
}
