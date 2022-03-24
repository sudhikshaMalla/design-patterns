package behaviouralPatterns.iteratorPattern;

import behaviouralPatterns.iteratorPattern.collections.Collection;
import behaviouralPatterns.iteratorPattern.collections.Queue;
import behaviouralPatterns.iteratorPattern.collections.Stack;
import behaviouralPatterns.iteratorPattern.iterators.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        Iterator itr = stack.iterator();
        System.out.println("Stack Elements are ::");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Collection queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        Iterator itrQ = queue.iterator();
        System.out.println("\n\nQueue Elements are ::");
        while (itrQ.hasNext()) {
            System.out.println(itrQ.next());
        }
    }
}
