package behaviouralPatterns.iteratorPattern.iterators;

import java.util.ArrayList;

public class StackIterator implements Iterator{
    ArrayList<Integer> collection = null;
    int ind;

    public StackIterator(ArrayList<Integer> collection, int ind) {
        this.collection = collection;
        this.ind = ind;
    }

    public boolean hasNext() {
        if(ind > -1)
            return true;
        return false;
    }

    public int next() {
        return collection.get(ind--);
    }
}
