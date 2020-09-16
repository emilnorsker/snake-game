package sample;


import javafx.scene.shape.Rectangle;

public class MyShape implements IMyShape
{
    double x;
    double y;
    double w = 10;
    double h = 10;

    Rectangle rectangle;


    public MyShape()
    {
        rectangle = new Rectangle((int)x,(int)y,(int)w,(int)h);
    }


    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setX(double newX)
    {
        x = newX;

    }

    @Override
    public void setY(double newY)
    {
        y = newY;
    }

    @Override
    public double getWidth() {
        return h;
    }

    @Override
    public double getHeight() {
        return w;
    }

    @Override
    public Rectangle getShape() {
        return rectangle;
    }

}
