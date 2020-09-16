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
        // create new joint in the body
        int length = body.size()+1;

        MyShape bodypart = new MyShape(0,0);

        Vector2D direction = directions.get(directions.size()-(length)); //direction of last added bodypart



        int x = body.get(body.size()-(length-1)).getX();
        int y = body.get(body.size()-(length-1)).getY();


        bodypart.setX(x - (direction.x * bodypart.getWidth()));
        bodypart.setY(y - (direction.y * bodypart.getHeight()));


        /*
        jointPosition.x -= direction.x * newJoint.getWidth();
        jointPosition.y -= direction.y * newJoint.getHeight();

        newJoint.setX(jointPosition.x);
        newJoint.setY(jointPosition.y);

        newJoint.relocate();
*/
        body.add(bodypart);


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
            System.out.println(count);

            bodypart.relocate();

            count++;

        }

        onEat();
    }
}
