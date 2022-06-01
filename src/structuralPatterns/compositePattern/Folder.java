package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Container{

    private String name;
    private List<Container> containerList = new ArrayList<>();
    private int level;

    public Folder(String name) {
        this.name = name;
        level = 0;
    }

    @Override
    public void getSize() {
        for(int i=0; i<level; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
        for (Container container : containerList) {
            container.setLevel(level + 1);
            container.getSize();
        }
    }

    public void addContainer(Container container) {
        containerList.add(container);
    }

    public void setLevel(int level) {
        this.level = level;
    }
}