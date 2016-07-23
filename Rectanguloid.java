/** Program:  14.14 Rectanguloid
  * File:     Rectanguloid.java 
  * Summary:  Chapter 14, Exercise 14, create a rectanguloid using javaFX
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.util.ArrayList;


public class Rectanguloid extends Application {
	//override start method
	@Override
    public void start(Stage primaryStage) {

		//create pane
        Pane pane = new Pane();

        //create an ArrayList for the shape
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        //create rectangle 1
        Rectangle r1 = new Rectangle(0,0, Color.TRANSPARENT);
        r1.setStroke(Color.BLACK);
        r1.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
        r1.yProperty().bind(pane.heightProperty().divide(4).add(25));
        r1.widthProperty().bind(pane.widthProperty().divide(2));
        r1.heightProperty().bind(pane.widthProperty().divide(2));
        shapes.add(r1);
        
        //create rectangle 2
        Rectangle r2 = new Rectangle(0,0, Color.TRANSPARENT);
        r2.setStroke(Color.BLACK);
        r2.xProperty().bind(pane.widthProperty().divide(4).add(25));
        r2.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
        r2.widthProperty().bind(pane.widthProperty().divide(2));
        r2.heightProperty().bind(pane.widthProperty().divide(2));
        shapes.add(r2);

        //create lines for rectanguloid
        Line l1 = new Line();
        l1.startXProperty().bind(r1.xProperty());
        l1.startYProperty().bind(r1.yProperty());
        l1.endXProperty().bind(r2.xProperty());
        l1.endYProperty().bind(r2.yProperty());
        shapes.add(l1);

        Line l2 = new Line();
        l2.startXProperty().bind(r1.xProperty());
        l2.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l2.endXProperty().bind(r2.xProperty());
        l2.endYProperty().bind(r2.yProperty().add(r1.heightProperty()));
        shapes.add(l2);

        Line l3 = new Line();
        l3.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l3.startYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        l3.endXProperty().bind(r2.xProperty().add(r1.widthProperty()));
        l3.endYProperty().bind(r2.yProperty().add(r1.heightProperty()));
        shapes.add(l3);

        Line l4 = new Line();
        l4.startXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        l4.startYProperty().bind(r1.yProperty());
        l4.endXProperty().bind(r2.xProperty().add(r1.widthProperty()));
        l4.endYProperty().bind(r2.yProperty());
        shapes.add(l4);


        pane.getChildren().addAll(shapes);
        Scene scene = new Scene(pane, 400, 400);
        scene.xProperty().add(scene.yProperty());
        primaryStage.setTitle("Rectanguloid");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);

    }
}




