/*
This programs includes UI COntrols:
-Menu
*/
package Unit6.UIControls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Part3 extends Application{
    @Override
    public void start(Stage primaryStage){
        MenuButton menu = new MenuButton("Language");
        //Creating menu Items
        MenuItem l1 = new MenuItem("Java");
        MenuItem l2 = new MenuItem("Python");
        MenuItem l3 = new MenuItem("C#");

        //Adding all the menuitem to the menu
        menu.getItems().addAll(l1,l2,l3);

        FlowPane root= new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);

        root.getChildren().addAll(menu);
        root.setStyle("-fx-background-color: BEIGE");

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("JavaFX MenuButton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}