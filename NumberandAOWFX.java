package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NumberandAOWFX {

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 300, 100);
    Stage primaryStage = new Stage();
    Button btn1 = new Button("Amount");
    Button btn2 = new Button("Weight");
    TextField text = new TextField();
    private int number;
    private int decrease;
    private int choice;

    public int getNumber() {
        return number;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public void setDecrease(int decrease){
        this.decrease = decrease;
    }

    public NumberandAOWFX(){

        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        primaryStage.setScene(scene);
        grid.add(text,0,0);
        grid.add(btn1,0,1);
        grid.add(btn2,1,1);

        primaryStage.setTitle("Number AoW");
        primaryStage.show();
    }

    public void Create(Order nOrder){
        btn1.setOnAction(event -> {
            number = Integer.valueOf(text.getText());
            choice += 1;
            if(choice == 3){
                primaryStage.close();
                WriteCakeFX WF = new WriteCakeFX();
                WF.Create(nOrder);
                WF.setChoice(choice);
                WF.setDecrease(decrease);
                WF.setNumber(number);
            }
            else {
                primaryStage.close();
                nOrder.addToCart(choice, number, decrease, "");
            }
        });
        btn2.setOnAction(event -> {
            number = Integer.valueOf(text.getText());
            if(choice == 2) {
                ErrorFX EF = new ErrorFX();
            }
            else {
                choice += 2;
                primaryStage.close();
                nOrder.addToCart(choice, number, decrease, "");
            }
        });
    }

}
