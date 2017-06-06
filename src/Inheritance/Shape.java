package Inheritance;

/**
 * Created by vaisakh on 04/06/17.
 */
public class Shape {

    private int x;
    private int y;


    Shape( int xcor, int ycor){

        x = xcor;
        y = ycor;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int xcor, int ycor){

        setX(xcor);
        setY(ycor);
    }

    public void move(int x1, int y1){
        set (getX() + x1, getY() + y1);
    }

}
