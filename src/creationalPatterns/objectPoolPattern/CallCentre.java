package creationalPatterns.objectPoolPattern;

import java.util.ArrayList;

public class CallCentre {

    private static ArrayList<Employee> busyEmployees = new ArrayList<>();
    private static ArrayList<Employee> freeEmployees = new ArrayList<>();

    public static int totalEmployees = 5;

    public static CallCentre instance = null;

    public static CallCentre getInstance() {
        if(instance == null) {
            instance = new CallCentre();
            for(int i=0; i<totalEmployees; i++) {
                freeEmployees.add(new Employee());
            }
        }
        return instance;
    }

    public Employee call() {
        Employee employee = null;
        if(freeEmployees.size()>0) {
            employee = freeEmployees.get(0);
            busyEmployees.add(employee);
            freeEmployees.remove(0);
        }
        else {
            System.out.println("No empty employee!");
        }
        return employee;
    }

    public void endCall(Employee employee) {
        freeEmployees.add(employee);
        busyEmployees.remove(employee);
    }

}