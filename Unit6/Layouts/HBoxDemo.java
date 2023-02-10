package Unit6.Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
  @Override
  public void start(Stage primaryStage){
    HBox row = new HBox();
    Label first = new Label("First");
    Label second = new Label("Second");
    
    row.getChildren().addAll(first,second);

    Scene scene = new Scene(row,300,300);

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
  public static void main(String[] args) {
    launch(args);
  }
}
