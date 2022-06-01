package structuralPatterns.compositePattern;

public class File implements Container{

    private String name;
    private int size;
    private int level;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void getSize() {
        for(int i=0; i<level; i++) {
            System.out.print("\t");
        }
        System.out.println(name + " - " + size + " KB");
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}