package creationalPatterns.prototypePattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Repository remote_repo = new Repository(new StringBuilder("DesignPatterns"),
                new StringBuilder("Repository implementing all design patterns"),
                new ArrayList<String>(), new ArrayList<String>());

        System.out.println("Remote Repository: \n" + remote_repo);

        Repository local_shallow_copy = remote_repo.getShallowClone();

        System.out.println("Local Shallow Copy: \n" + local_shallow_copy);

        local_shallow_copy.getBranches().add("main");
        local_shallow_copy.getReadMe().append(" using java");

        System.out.println("\nAfter editing shallow copy : \n");

        System.out.println("Remote Repository: \n" + remote_repo);

        System.out.println("Local Shallow Copy: \n" + local_shallow_copy);

        Repository local_deep_copy = remote_repo.getDeepClone();

        System.out.println("\n\nRemote Repository: \n" + remote_repo);

        System.out.println("Local Deep Copy: \n" + local_deep_copy);

        local_deep_copy.getFiles().add("index.html");
        local_deep_copy.getRepositoryName().append("InJava");

        System.out.println("\nAfter editing shallow copy : \n");
        System.out.println("Remote Repository: \n" + remote_repo);

        System.out.println("Local Deep Copy: \n" + local_deep_copy);

    }
}
