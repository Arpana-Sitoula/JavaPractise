package Unit6.Layouts;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FlowPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");

        FlowPane root = new FlowPane(Orientation.HORIZONTAL,5,5);
        root.getChildren().add(b1);
        root.getChildren().add(b2);

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("FlowPaneDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
