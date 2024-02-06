package org.example.hellofx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //to create a new stage
//        Stage stage =new Stage();
        //to see the stage
//        stage.show();
        //setting the root
//        Group root=new Group();
//        //creating the scene
//        Scene scene=new Scene(root, Color.BLACK);
//        stage.setTitle("Stage Demo Program");
//
//        //to create an image object
//        Image icon=new Image("https://logowik.com/content/uploads/images/731_java.jpg");
//        //to set image as the icon
//        stage.getIcons().add(icon);
//        stage.setScene(scene);
//
//        //to set the stage and height of the stage
//        stage.setWidth(420);
//        stage.setHeight(420);
//        stage.setResizable(false);


        //to change the stage
//        stage.setX(50);
//        stage.setY(50);

        //to open it in full screen
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("You cannot escape until you press q.");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

    //this is how scene works in javaFX.
//        stage.show();



        //NOW VIDEO TWO//
        Group root=new Group();
        Scene scene =new Scene(root,750,750,Color.SKYBLUE);
        Stage stage=new Stage();

        Text text=new Text();
        text.setText("setting the text:)");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.RED);

        //To create a line
        Line line=new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStroke(Color.RED);
        line.setStrokeWidth(5);
        line.setRotate(45);

        Rectangle rectangle=new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.RED);
        rectangle.setStrokeWidth(5);
        rectangle.setRotate(45);


        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(
                100.0,100.0,
                400.0,300.0,
                100.0,400.0

        );
        triangle.setFill(Color.BLUE);
        triangle.setStroke(Color.RED);
        triangle.setStrokeWidth(5);

        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setFill(Color.ORANGE);
        circle.setRadius(50);

        Image pizza =new Image("https://api.pizzahut.io/v1/content/en-ca/ca-1/images/pizza/pizza.supreme-lovers.3706cdc20b0752ac212c0d68a310fb18.1.jpg");
        ImageView imageView=new ImageView(pizza);
        imageView.setX(100);
        imageView.setY(400);


        //to add the node children of our root
        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(text);
        root.getChildren().add(rectangle);
        stage.setScene(scene);
        stage.show();

    }

}