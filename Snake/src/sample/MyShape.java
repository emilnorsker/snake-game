package sample;

public class MyShape implements IMyShape
{
    double x;
    double y;
    double w = 100;
    double h = 100;


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

}
