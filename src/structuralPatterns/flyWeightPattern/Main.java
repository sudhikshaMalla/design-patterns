package structuralPatterns.flyWeightPattern;

public class Main {

    public static void main(String[] args) {

        CommiteeFactory commiteeFactory = new CommiteeFactory();


        commiteeFactory.getCommitteeMember("Chairman");
        commiteeFactory.getCommitteeMember("Principal");

        commiteeFactory.getCommitteeMember("Chairman");
        commiteeFactory.getCommitteeMember("Principal");

    }

}