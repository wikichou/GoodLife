package test;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowCusFX {

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 200, 300);
    Stage primaryStage = new Stage();
    Label name = new Label();
    Label address = new Label();
    Label phone = new Label();

}
