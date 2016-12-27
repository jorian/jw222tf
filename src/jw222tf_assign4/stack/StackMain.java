package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class StackMain {
    public static void main(String[] args) {

        Stacker enStack = new Stacker();

        enStack.push(43);
        enStack.push(3);
        enStack.push(4);
        enStack.push(34);
        enStack.push(54);
        enStack.push(99);
        enStack.push(23); // index out of bound.

        System.out.println("Amount in stack: " + enStack.size());

        System.out.println("Is stack empty? " + enStack.isEmpty());

        System.out.println("Get one from stack: " + enStack.pop());

        System.out.println("Check next one: " + enStack.peek());

        System.out.println("Get one from stack: " + enStack.pop());

        System.out.println("Remaining amount in stack: " + enStack.size());

        System.out.println("Is stack empty? " + enStack.isEmpty());

        Iterator iterator = enStack.iterator();

        System.out.println("\nRemaining elements in stack:");
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o + " ");
        }
    }
}
