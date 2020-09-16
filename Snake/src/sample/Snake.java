package sample;

import com.sun.javafx.geom.Vec2d;

import java.util.ArrayList;
import java.util.Vector;

public class Snake implements ISnake
{
    int size;

    ArrayList<IMyShape> body;

    public ArrayList<Vector2D> directions;


    public Snake()
    {
        body = new ArrayList<IMyShape>();
        directions = new ArrayList<Vector2D>();

        body.add(new MyShape());
    }

    @Override
    public void onCollision()
    {

    }

    @Override
    public void onEat()
    {

    }

    @Override
    public void move()
    {
        int count = 1; // 1 becaue of 0 index and size not playing well together.
        for (IMyShape bodypart: body)
        {

            Vector2D direction = directions.get(directions.size()-count);
            double x = bodypart.getX();
            double y = bodypart.getY();



            bodypart.setX(x+direction.x);
            bodypart.setY(y+direction.y);
            count ++;
        }
    }
}
