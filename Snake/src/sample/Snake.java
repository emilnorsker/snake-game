package sample;

import java.util.ArrayList;

public class Snake
{
    public ArrayList<MyShape> body;

    public ArrayList<Vector2D> directions;


    public Snake()
    {
        body = new ArrayList<MyShape>();
        directions = new ArrayList<Vector2D>();
        directions.add(new Vector2D(1,0));
        body.add(new MyShape(120,180));
    }

    public void onCollision()
    {

    }

    public void onEat()
    {
        // create new joint in the body
        MyShape bodypart = new MyShape(0,0);

        // add to body
        body.add(bodypart);

        //position is the current last links position, minus the last direction that link made

        System.out.println(directions.size() +"  "+ body.size());
        Vector2D direction = directions.get(directions.size()-body.size());

        int oldX = body.get(body.size()-2).getX();
        int oldY = body.get(body.size()-2).getY();

        int newX = oldX - (direction.x* bodypart.getWidth());
        int newY = oldY - (direction.y* bodypart.getHeight());

        bodypart.setX(newX);
        bodypart.setY(newY);
        bodypart.relocate();





    }

    public void move()
    {
        int count = 1; // 1 becaue of 0 index and size not playing well together.
        for (MyShape bodypart: body)
        {

            System.out.println(directions.size());

            Vector2D direction = directions.get(directions.size() - count);
            int x = bodypart.getX();
            int y = bodypart.getY();
            System.out.println(direction);

            System.out.println(bodypart);

            bodypart.setX(x + (direction.x * bodypart.getWidth()));
            bodypart.setY(y + (direction.y * bodypart.getHeight()));

            bodypart.relocate();

            count++;
        }
        onEat();


    }
}
