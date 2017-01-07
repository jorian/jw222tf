package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class StackMain {
    public static void main(String[] args) {

        Stacker Stapel = new Stacker(7);
        //try {
            Stapel.pop();
        //}
        //catch (Exception e) {
        //    e.getMessage();
        //}
    }
}
        /*
        Stapel.push(43);
        Stapel.push(3);
//        Stapel.push(4);
//        Stapel.push(34);
//        Stapel.push(54);
//        Stapel.push(99);
//        Stapel.push(23); // index out of bound.

        System.out.println("Amount in stack: " + Stapel.size());

        System.out.println("Is stack empty? " + Stapel.isEmpty());

        System.out.println("Get one from stack: " + Stapel.pop());

        System.out.println("Check next one: " + Stapel.peek());

        System.out.println("Get one from stack: " + Stapel.pop());
        System.out.println("Get one from stack: " + Stapel.pop());

        System.out.println("Remaining amount in stack: " + Stapel.size());

        System.out.println("Is stack empty? " + Stapel.isEmpty());

        Iterator iter = Stapel.iterator();

        if (!Stapel.isEmpty()) {
            System.out.println("\nRemaining elements in stack:");
            while (iter.hasNext()) {
                Object o = iter.next();
                System.out.println(o + " ");
            }
        }
    }
}
*/