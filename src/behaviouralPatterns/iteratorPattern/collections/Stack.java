package behaviouralPatterns.iteratorPattern.collections;

import behaviouralPatterns.iteratorPattern.iterators.Iterator;
import behaviouralPatterns.iteratorPattern.iterators.StackIterator;

import java.util.ArrayList;

public class Stack implements Collection{
    Iterator itr = null;
    ArrayList<Integer> collection = new ArrayList<Integer>();

    public Iterator iterator() {
        if(itr==null) {
            itr = new StackIterator(collection,collection.size() - 1);
        }
        return itr;
    }

    public void add(int val) {
        collection.add(val);
    }
}
