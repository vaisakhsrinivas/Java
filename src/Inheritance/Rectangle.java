package Inheritance;

/**
 * Created by vaisakh on 04/06/17.
 */
public class Rectangle extends Shape{

    private int width;
    private int height;

    Rectangle(int xcor, int ycor, int w, int h){

        super(xcor,ycor);

        width = w;
        height = h;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
