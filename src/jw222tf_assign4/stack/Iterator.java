package jw222tf_assign4.stack;

/**
 * Created by JorianWielink on 27/12/2016.
 */

class Iterator {
    /*
    This Iterator class is used to iterate through the objects, such as virtual plates in a restaurant.
     */

    private int firstElement = 0;
    private Object[] elements;
    private int max;

    Iterator(Object[] array, int size) {
        elements = array;
        max = size;
    }

    boolean hasNext() {
        return firstElement < max;
    }

    Object next() {
        return elements[firstElement++];
    }
}
