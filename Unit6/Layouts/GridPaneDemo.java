package Unit6.Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        GridPane gp = new GridPane();

        Label label = new Label("Example");
        GridPane.setRowIndex(label, null);
        GridPane.setColumnIndex(label, null);

        gp.getChildren().add(label);
        gp.add(new Button("Press me"),1,0);
        gp.add(new Button("Press me"),0,1);
        gp.add(new Button("Press me"),1,1);
        gp.add(new Button("Press me"),0,0);

        gp.getChildren().add(label);

        Scene scene = new Scene(gp,300,300);
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
