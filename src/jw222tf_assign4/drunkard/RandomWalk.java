package jw222tf_assign4.drunkard;

/**
 * Created by Jorian on 6-1-2017 at 12:08.
 */
public class RandomWalk {
    /*
    RandomWalk is a program that let's a virtual person walk randomly a fixed size of steps on a fixed size pane.
    To determine positions, x- and y-axes are used.
     */
    private int xCoord;
    private int yCoord;
    private int maxSteps;
    private int stepCount;
    private int paneSize;

    RandomWalk(int max, int size) {
        maxSteps = max;
        paneSize = size;
    }

    public String toString() {
        return "Number of steps taken: " + stepCount + "\nCurrent position: " + xCoord + "," + yCoord;
    }

    void takeStep() {
        /*
        Random method is used to get a number 0, 1, 2 or 3.
        0 is up (yCoord + 1)
        1 is down (yCoord - 1)
        2 is right (xCoord + 1)
        3 is left (xCoord - 1)
         */

        int randValue = (int) (Math.random() * 4);
        switch (randValue) {
            case (0):
                yCoord += 1;
                break;
            case (1):
                yCoord -= 1;
                break;
            case (2):
                xCoord += 1;
                break;
            case (3):
                xCoord -= 1;
                break;
        }
        stepCount++;
    }

    /*
    Determines if more steps can be taken
     */
    boolean moreSteps() {
        return stepCount < maxSteps;
    }

    /*
    Determines if coordinate is inside given bounds.
    Pane size can be negative, since the position (x,y) on the axes also work with negative integers, i.e. -34,-23 to
    determine a position.
     */
    boolean inBounds() {
        return (Math.abs(xCoord) < paneSize && Math.abs(yCoord) < paneSize);
    }

    /*
    If more steps are allowed and the coordinates do not exceed the pane size, a step is taken.
     */
    public void walk() {
        while (inBounds() && moreSteps()) {
            takeStep();
        }
    }
}
