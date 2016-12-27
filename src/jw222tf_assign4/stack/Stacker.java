package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Stacker implements IStack {
    private int size;
    private Object[] stapel;

    Stacker(int stackSize) {
        stapel = new Object[stackSize];
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
        stapel[size()] = element;
        size++;
    }

    @Override
    public Object pop() {
        if (size() > 0) {
            size--;
            return stapel[size()];
        } else {
            System.out.println("No elements in stack");
            return null;
        }
    }

    @Override
    public Object peek() {
        return stapel[size() - 1];
    }

    @Override
    public Iterator iterator() {
        return new Iterator(stapel, size);
    }
}
