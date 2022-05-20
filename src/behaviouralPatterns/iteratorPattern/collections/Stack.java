package behaviouralPatterns.iteratorPattern.collections;

import behaviouralPatterns.iteratorPattern.iterators.Iterator;
import behaviouralPatterns.iteratorPattern.iterators.StackIterator;

import java.util.ArrayList;

public class Stack implements Collection{
    ArrayList<Integer> collection = new ArrayList<Integer>();

    public Iterator iterator() {
        return new StackIterator(collection,collection.size() - 1);
    }

    public void add(int val) {
        collection.add(val);
    }
}
