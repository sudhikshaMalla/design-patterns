package structuralPatterns.flyWeightPattern;

import java.util.HashMap;
import java.util.Scanner;

public class CommiteeFactory {

    HashMap<String, Person> committee = new HashMap<>();

    public void getCommitteeMember(String role) {

        Person member = committee.get(role);

        if(member == null) {
            System.out.println("Committee Member not found...");
            System.out.println("Please enter the name of the person to assign the post");
            Scanner sc = new Scanner(System.in);
            String personName = sc.next();
            committee.put(role, new CommiteeMember(personName, role));
        }

        committee.get(role).getName();
        committee.get(role).getRole();

    }
}