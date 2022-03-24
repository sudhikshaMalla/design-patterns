package behaviouralPatterns.iteratorPattern.collections;

import behaviouralPatterns.iteratorPattern.iterators.Iterator;

public interface Collection {
    Iterator iterator();
    void add(int val);
}
