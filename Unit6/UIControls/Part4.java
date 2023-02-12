package Unit6.UIControls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Part4 extends Application {
    @Override
    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("Button");

        Tooltip tooltip_login= new Tooltip("Login to Application");
        btn.setTooltip(tooltip_login);

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("HelloWorld");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
