package jw222tf_assign4.stack;

import java.util.EmptyStackException;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Stacker implements IStack {
    private int size;
    private Object[] stapel = new Object[6];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    @Override
    public void push(Object element) {
        stapel[size()] = element;
        size++;
    }

    @Override
    public Object pop() throws EmptyStackException {
        try {
            size--;
            return stapel[size()];
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Object peek() {
        Object temp = stapel[size() - 1];
        return temp;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(stapel, size);
    }
}
