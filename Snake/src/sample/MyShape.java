package sample;


import javafx.scene.shape.Rectangle;

public class MyShape implements IMyShape
{
    int x;
    int y;
    int w = 10;
    int h = 10;

    Rectangle rectangle;


    public MyShape(int x, int y)
    {
        rectangle = new Rectangle(x,y,w,h);
    }


    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int newX)
    {
        x = newX;

    }

    @Override
    public void setY(int newY)
    {
        y = newY;
    }

    @Override
    public int getWidth() {
        return h;
    }

    @Override
    public int getHeight() {
        return w;
    }

    @Override
    public void relocate()
    {
        rectangle.relocate(x,y);
    }

    @Override
    public Rectangle getShape() {
        return rectangle;
    }

}
