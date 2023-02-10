package Unit6.Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane bp = new BorderPane();
        bp.setTop(new Button("button Top"));
        bp.setLeft(new Button("button left"));
        bp.setRight(new Button("button right"));
        bp.setCenter(new Button("button center"));
        bp.setBottom(new Button("button center"));
    
        StackPane root = new StackPane();
        root.getChildren().add(bp);

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("BorderPaneDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
