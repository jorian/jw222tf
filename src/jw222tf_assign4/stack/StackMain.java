package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class StackMain {
    public static void main(String[] args) {
        Stacker stack = new Stacker(7);

        /*
        Throws ArrayIndexOutOfBoundException if element is pushed when the array size has been reached.
         */
        stack.push(43);
        stack.push(3);
        stack.push(4);
        stack.push(34);
        stack.push(54);
        stack.push(99);
        stack.push(23);

        System.out.println("Amount in stack: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Get one from stack: " + stack.pop());

        System.out.println("Check next one: " + stack.peek());

        System.out.println("Get one from stack: " + stack.pop());
        System.out.println("Get one from stack: " + stack.pop());

        System.out.println("Remaining amount in stack: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());

        Iterator iter = stack.iterator();

        if (!stack.isEmpty()) {
            System.out.println("\nRemaining elements in stack:");
            while (iter.hasNext()) {
                Object o = iter.next();
                System.out.println(o + " ");
            }
        }
    }
}