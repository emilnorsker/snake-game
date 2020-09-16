package sample;

import com.sun.javafx.geom.Vec2d;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * array with inputs, each update the input list have one added (if no input, then the last element).
 * each snake rectangle is moved according to the input list (head == last element, head -1n == last element -1.)
 *
 */

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500);

        ISnake snake = new Snake();




        scene.setOnKeyPressed
                (e ->
                {
                    Vector2D direction = new Vector2D(0d,0d);

                    switch (e.getCode())
                    {
                        case RIGHT:
                            direction.x =1;
                            break;
                        case LEFT:
                            direction.x = -1;
                            break;
                        case UP:
                            direction.y = 1;
                            break;
                        case DOWN:
                            direction.y = -1;
                            break;
                        default:
                            if (((Snake) snake).directions.size()>0)
                            direction = ((Snake) snake).directions.get(((Snake) snake).directions.size()-1);
                            break;

                    }

                    updateDirections(snake, direction);

                });

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


    public void updateDirections(ISnake snake, Vector2D direction)
    {
        ((Snake) snake).directions.add(direction);
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
