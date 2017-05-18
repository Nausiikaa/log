import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.Button; 
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.awt.Graphics;
import javafx.scene.shape.Circle;
public class Conversacion extends Application
{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage escenario)
    {
        Group root = new Group();
        Circle circulo = new Circle();
        circulo.setFill(Color.RED);
        circulo.setRadius(20.0f);
        circulo.setCenterX(100.0f);
        circulo.setCenterY(100.0f);
        root.getChildren().add(circulo);
        Scene escena = new Scene(root, 500, 500);
        escenario.setScene(escena);
        escenario.show();
    }

}