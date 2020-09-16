package sample;

public class MyShape implements IMyShape
{
    double x;
    double y;


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

}
