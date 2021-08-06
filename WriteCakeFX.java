package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WriteCakeFX {

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 300, 100);
    Stage primaryStage = new Stage();
    Label label = new Label("What do you want write on cake?");
    Button btn1 = new Button("Add");
    TextField text = new TextField();
    private int choice;
    private int number;
    private int decrease;
    private String oncake;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setDecrease(int decrease){
        this.decrease = decrease;
    }
    public WriteCakeFX(){
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        primaryStage.setScene(scene);
        grid.add(label,0,0);
        grid.add(btn1,0,2);
        grid.add(text,0,1);

        primaryStage.setTitle("OnCake");
        primaryStage.show();

    }

    public void Create(Order nOrder){
        btn1.setOnAction(event -> {
            oncake = text.getText();
            nOrder.addToCart(choice, number, decrease, oncake);
            primaryStage.close();
    });

    }
}
