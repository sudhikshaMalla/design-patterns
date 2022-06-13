package creationalPatterns.objectPoolPattern;

public class Main {
    public static void main(String[] args) {

        CallCentre callCentre = CallCentre.getInstance();

        Employee emp1 = callCentre.call();
        if(emp1 != null) {
            emp1.attendCall();
        }

        Employee emp2 = callCentre.call();
        if(emp2 != null) {
            emp2.attendCall();
        }

        Employee emp3 = callCentre.call();
        if(emp3 != null) {
            emp3.attendCall();
        }

        Employee emp4 = callCentre.call();
        if(emp4 != null) {
            emp4.attendCall();
        }

        Employee emp5 = callCentre.call();
        if(emp5 != null) {
            emp5.attendCall();
        }

        Employee emp6 = callCentre.call();
        if(emp6 != null) {
            emp6.attendCall();
        }

        callCentre.endCall(emp1);

        Employee emp7 = callCentre.call();
        if(emp7 != null) {
            emp7.attendCall();
        }

    }
}