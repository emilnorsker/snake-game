package sample;

import com.sun.javafx.geom.Vec2d;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Vector;

public class Snake implements ISnake
{
    int size;

    public ArrayList<IMyShape> body;

    public ArrayList<Vector2D> directions;


    public Snake()
    {
        body = new ArrayList<IMyShape>();
        directions = new ArrayList<Vector2D>();
        directions.add(new Vector2D(0,0));
        body.add(new MyShape(50,50));
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

            Vector2D direction = directions.get(directions.size() - count);
            int x = bodypart.getX();
            int y = bodypart.getY();

            bodypart.setX(x + (direction.x * bodypart.getWidth()));
            bodypart.setY(y + (direction.y * bodypart.getHeight()));

            System.out.println("new x =  "+x + (direction.x * bodypart.getWidth()));
            System.out.println("new y =  "+y + (direction.y * bodypart.getHeight()));

                bodypart.relocate();

                count++;

        }
    }
}
