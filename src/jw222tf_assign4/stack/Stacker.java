package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Stacker implements IStack {
    private int size;
    private Object[] stack;

    Stacker(int stackSize) {
        stack = new Object[stackSize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public void push(Object element) {
        stack[size()] = element;
        size++;
    }

    @Override
    public Object pop() {
            size--;
            return stack[size()];
    }

    @Override
    public Object peek() {
        return stack[size() - 1];
    }

    @Override
    public Iterator iterator() {
        return new Iterator(stack, size);
    }
}
