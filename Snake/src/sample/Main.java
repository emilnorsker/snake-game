package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * array with inputs, each update the input list have one added (if no input, then the last element).
 * each snake rectangle is moved according to the input list (head == last element, head -1n == last element -1.)
 *
 */

public class Main extends Application
{


    public static Group group;
    public static Vector2D inputDirection;

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        group = new Group();
        Scene scene = new Scene(group, 500, 500);

        Snake snake = new Snake();




        scene.setOnKeyPressed
                (e ->
                {
                    Vector2D direction = new Vector2D(0,0);
                    Vector2D lastDirection = new Vector2D(0, 0);
                    lastDirection = snake.directions.get(snake.directions.size()-1);

                    System.out.println(e.getCode());
                    switch (e.getCode())
                    {
                        case RIGHT:
                            direction.x =1;
                            if (lastDirection.x == -1)
                                direction = lastDirection;
                            break;
                        case LEFT:
                            direction.x = -1;
                            if (lastDirection.x == 1)
                                direction = lastDirection;
                            break;
                        case UP:
                            direction.y = -1;
                            if (lastDirection.y == 1)
                                direction = lastDirection;
                            break;
                        case DOWN:
                            direction.y = 1;
                            if (lastDirection.y == -1)
                                direction = lastDirection;
                            break;
                        default: // if no input or wrong input, continue with last correct input.
                            if (snake.directions.size()>0)
                                direction = lastDirection;
                            else
                                direction = new Vector2D(1,0);
                            break;
                    }
        });

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Thread run= new Thread(new Runner(snake));
        run.start();

    }



    public static void main(String[] args)

    {
        launch(args);
    }
}
