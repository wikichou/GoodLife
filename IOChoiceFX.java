package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class IOChoiceFX {

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 170, 50);
    Stage primaryStage = new Stage();
    Button btn1 = new Button("put in");
    Button btn2 = new Button("take out");
    int decrease = 0;
    int choice = 0;
    int number = 0;

    public int getdecrease(){
        return decrease;
    }
    public int getchoice(){
        return choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public int getNumber(){
        return number;
    }

    public IOChoiceFX(){

        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        primaryStage.setScene(scene);
        grid.add(btn1,0,0);
        grid.add(btn2,1,0);

        primaryStage.setTitle("IO choice");
        primaryStage.show();
    }

    public void getChoice(Order nOrder){//1 for in,0 for out
        btn1.setOnAction(event -> {
            decrease = 1;
            NumberandAOWFX NMF = new NumberandAOWFX();
            NMF.Create(nOrder);
            NMF.setChoice(choice);
            NMF.setDecrease(decrease);
            primaryStage.close();
        });
        btn2.setOnAction(event -> {
            decrease = 0;
            NumberandAOWFX NMF = new NumberandAOWFX();
            NMF.Create(nOrder);
            NMF.setChoice(choice);
            NMF.setDecrease(decrease);
            primaryStage.close();
        });
    }

}
