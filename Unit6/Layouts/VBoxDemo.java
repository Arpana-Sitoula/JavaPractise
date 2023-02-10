package Unit6.Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        VBox col = new VBox();
        Label upper = new Label("Upper");
        Label lower = new Label("Lower");
        col.getChildren().addAll(upper,lower);
        
        Scene scene = new Scene(col,300,300);
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
