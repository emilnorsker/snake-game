package sample;


import javafx.scene.shape.Rectangle;

public interface IMyShape
{
    public int getX();
    public int getY();
    public void setX(int newX);
    public void setY(int newY);

    public int getWidth();
    public int getHeight();

    public Rectangle getShape();


}
