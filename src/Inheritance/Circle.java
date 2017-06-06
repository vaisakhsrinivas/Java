package Inheritance;

/**
 * Created by vaisakh on 04/06/17.
 */
public class Circle extends Shape{

    private int radius;


    Circle(int xcor, int ycor, int r){

        super(xcor,ycor);

        radius = r;
        setRadius(r);


    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
