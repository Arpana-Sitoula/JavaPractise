/*
This programs includes UI COntrols:
-Label, 
-TextField, 
-Button, 
-RadioButton 
*/
package Unit6.UIControls;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Part1 extends Application{
    @Override
    public void start(Stage primaryStage){
        Label label = new Label("Your Gender:");
        Label info = new Label();
        info.setTextFill(Color.RED);

        ToggleGroup group = new ToggleGroup();

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov,Toggle old_toggle, Toggle new_toggle){

                if(group.getSelectedToggle()!=null){
                    RadioButton btn = (RadioButton) group.getSelectedToggle();
                    System.out.println("Button:"+btn.getText());
                    info.setText("You are "+btn.getText());
                }
            }
        });

        RadioButton btn1 = new RadioButton("Male");
        btn1.setToggleGroup(group);
        btn1.setSelected(true);

        RadioButton btn2 = new RadioButton("Female");
        btn2.setToggleGroup(group);

        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().addAll(label,btn1,btn2,info);

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
