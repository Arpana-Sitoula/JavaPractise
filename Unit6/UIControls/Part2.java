/*
This program includes UI Controls:
-Checkbox,
-Hyperlink
*/
package Unit6.UIControls;

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Part2 extends Application {
    @Override
    public void start(Stage primaryStage){
        Hyperlink hl = new Hyperlink("Go to SPM home page");
        hl.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                getHostServices().showDocument("https://spm.com.np");
            }
        });

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.getChildren().addAll(hl);

        Scene scene = new Scene(root, 300,300);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
