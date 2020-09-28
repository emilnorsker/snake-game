package sample;

import javafx.scene.Group;

public class Runner implements Runnable
{

    static Snake snake;

    public Runner(Snake snake)
    {
        this.snake = snake;
    }

    @Override
    public void run()
    {

        updateDirections(snake, Main.inputDirection);
        snake.move();
        redraw(Main.group);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void redraw(Group group)
    {
        for (MyShape bodypart:  snake.body)
        {
            group.getChildren().add(bodypart.getShape());
        }

        for (MyShape bodypart:  snake.body)
        {
            group.getChildren().remove(bodypart.getShape());
            group.getChildren().add(bodypart.getShape());
        }

    }


    public void updateDirections(Snake snake, Vector2D direction)
    {
        System.out.println("updating irs");
        snake.directions.add(direction);
    }
}
