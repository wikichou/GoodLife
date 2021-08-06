package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HintFX {

    Label prompt = new Label("");

    public HintFX(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(grid, 500, 100);
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);

        grid.add(prompt,0,1);
        primaryStage.setTitle("ExitFX");
        primaryStage.show();
    }
}
