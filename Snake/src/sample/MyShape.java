package sample;


import javafx.scene.shape.Rectangle;

public class MyShape
{
    int x;
    int y;
    int w = 10;
    int h = 10;

    Rectangle rectangle;


    public MyShape(int x, int y)
    {
        this.x = x;
        this.y = y;
        rectangle = new Rectangle(x,y,w,h);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX)
    {
        x = newX;

    }

    public void setY(int newY)
    {
        y = newY;
    }

    public int getWidth() {
        return h;
    }

    public int getHeight() {
        return w;
    }

    public void relocate()
    {
        rectangle.relocate(x,y);
    }

    public Rectangle getShape() {
        return rectangle;
    }

}
