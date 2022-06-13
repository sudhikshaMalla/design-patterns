package structuralPatterns.flyWeightPattern;

public class CommiteeMember implements Person{

    public String name = null;
    public String role = null;

    public CommiteeMember(String newName, String role) {
        name = newName;
        this.role = role;
    }

    @Override
    public void getName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void getRole() {
        System.out.println("Role: " + role);
    }
}