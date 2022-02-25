package CreationalPatterns.prototype;

import java.util.ArrayList;

public class Repository implements Prototype, Cloneable{
    private StringBuilder repositoryName;
    private StringBuilder readMe;
    private ArrayList<String> branches;
    private ArrayList<String> files;

    public Repository(StringBuilder repositoryName, StringBuilder readMe, ArrayList<String> collaborators, ArrayList<String> files) {
        this.repositoryName = repositoryName;
        this.readMe = readMe;
        this.branches = collaborators;
        this.files = files;
    }

    public StringBuilder getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(StringBuilder repositoryName) {
        this.repositoryName = repositoryName;
    }

    public StringBuilder getReadMe() {
        return readMe;
    }

    public void setReadMe(StringBuilder readMe) {
        this.readMe = readMe;
    }

    public ArrayList<String> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<String> branches) {
        this.branches = branches;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "repositoryName=" + repositoryName +
                ", readMe=" + readMe +
                ", branches=" + branches +
                ", files=" + files +
                '}';
    }

    public Repository getShallowClone() {
        Repository clone = null;
        try {
            clone = (Repository) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


    public Repository getDeepClone() {
        return new Repository(new StringBuilder(String.valueOf(this.repositoryName)),
                new StringBuilder(String.valueOf(this.readMe)),
                new ArrayList<>(this.branches),
                new ArrayList<>(this.files));
    }


}
