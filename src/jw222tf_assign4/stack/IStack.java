package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public interface IStack {
    // Current stack size
    int size();

    // True if stack is empty
    boolean isEmpty();

    // Add element at top of stack
    void push(Object element);

    // Return and remove top element
    // exception if stack is empty.
    Object pop();

    // Return (without removing) top element,
    // exception if stack is empty.
     Object peek();

    // Element iterator
    jw222tf_assign4.stack.Iterator iterator();
}