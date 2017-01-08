package jw222tf_assign4.stack;

import java.util.EmptyStackException;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Stacker implements IStack {
    private int size;
    private Object[] stack;
    private int initialStacksize;

    Stacker(int stackSize) {
        initialStacksize = stackSize;
        stack = new Object[stackSize];
    }

    @Override
    public int size() {
        return size;
    } // Current stack size

    @Override
    public boolean isEmpty() {
        return size <= 0;
    } // true if stack is empty

    @Override
    public void push(Object element) { // Add element at top of stack
        if (this.size() < initialStacksize) {
            stack[size()] = element;
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    // Return and remove top element,
    // exception if stack is empty

    // Could it be that this exercise is exactly the same as the explanation of exceptions on docs.oracle.com? :X
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        size--;
        return stack[size()];
    }

    @Override
    // Return (without removing) top element,
    // exception if stack is empty.
    public Object peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        return stack[size() - 1];
    }

    @Override
    public Iterator iterator() {
        return new Iterator(stack, size);
    }  // Element iterator
}
