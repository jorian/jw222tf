package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class Point {
    private int x = 0, y = 0;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int inputX, int inputY) {
        x = inputX;
        y = inputY;
    }

    public String toString() {
        return ( "("+this.x+","+this.y+")" );
    }

    public boolean isEqualTo(Point point){
        if (point.x == this.x && point.y == this.y) {
            return true;
        }
        return false;
    }

    public double distanceTo(Point point) {
        double dist = Math.sqrt(Math.pow(point.x - this.x, 2.0) + Math.pow(point.y - this.y, 2.0));
        return dist;
    }

    public void move(int moveX, int moveY) {
        x += (moveX);
        y += (moveY);
    }

    public void moveToXY(int inputX, int inputY) {
        x = inputX;
        y = inputY;
    }
}
