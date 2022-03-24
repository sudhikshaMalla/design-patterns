package behaviouralPatterns.iteratorPattern.iterators;

import java.util.ArrayList;

public class QueueIterator implements Iterator{
    ArrayList<Integer> collection = null;
    int ind;
    int size = 0;

    public QueueIterator(ArrayList<Integer> collection, int ind) {
        this.collection = collection;
        this.ind = ind;
        this.size = collection.size();
    }

    public boolean hasNext() {
        if(ind < collection.size())
            return true;
        return false;
    }

    public int next() {
        return collection.get(ind++);
    }
}
