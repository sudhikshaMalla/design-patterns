package behaviouralPatterns.iteratorPattern.collections;

import behaviouralPatterns.iteratorPattern.iterators.Iterator;
import behaviouralPatterns.iteratorPattern.iterators.QueueIterator;

import java.util.ArrayList;

public class Queue implements Collection{
    Iterator itr = null;
    ArrayList<Integer> collection = new ArrayList<Integer>();

    public Iterator iterator() {
        if(itr==null) {
            itr = new QueueIterator(collection,0);
        }
        return itr;
    }

    public void add(int val) {
        collection.add(val);
    }
}
