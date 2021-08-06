package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowOrderFX {

    Order tmp = new Order();
    //int merch[] ;

    /*public void setOrder(Order a){
        this.tmp = a;
    }*/

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 400, 300);
    Stage primaryStage = new Stage();
    Label Goods = new Label();
    Label Amount = new Label();
    Label Weight = new Label();
    Label cabbage = new Label();
    Label cabbageAmount = new Label();
    Label cabbageWeight = new Label();
    Label cake = new Label();
    Label cakeAmount = new Label();
    Label cucumber = new Label();
    Label cucumberAmount = new Label();
    Label cucumberWeight = new Label();
    Label sweetpotato = new Label();
    Label sweetpotatoAmount = new Label();
    Label sweetpotatoWeight = new Label();
    Label total = new Label();
    Label serial = new Label();
    Label Word = new Label();
    Label name = new Label();
    Label address = new Label();
    Label phonenumber = new Label();//show order

    public ShowOrderFX(Order norder, customerAccount c){//show order
        int merch[] = norder.getAllChoice();
        Label Goods = new Label("Goods");
        Label Amount = new Label("Amount");
        Label Weight = new Label("Weight");
        Label cabbage = new Label("cabbage");
        Label cabbageAmount = new Label(Integer.toString(merch[0]));
        Label cabbageWeight = new Label(Integer.toString(merch[1]));
        Label cake = new Label("cake");
        Label cakeAmount = new Label(Integer.toString(merch[2]));
        Label cucumber = new Label("cucumber");
        Label cucumberAmount = new Label(Integer.toString(merch[3]));
        Label cucumberWeight = new Label(Integer.toString(merch[4]));
        Label sweetpotato = new Label("sweetpotato");
        Label sweetpotatoAmount = new Label(Integer.toString(merch[5]));
        Label sweetpotatoWeight = new Label(Integer.toString(merch[6]));
        Label total = new Label("Total :" + norder.getTotal());
        Label serial = new Label("serial :"+ norder.getSerial());
        Label Word = new Label("CakeWord :" + norder.getCakeword());
        Label name = new Label("name :" + c.getname());
        Label address = new Label("address :"+ c.getaddress());
        Label phonenumber = new Label("phonenumber :" + c.getphonenumber());

        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        primaryStage.setScene(scene);
        grid.add(Goods,0,0);
        grid.add(Amount,1,0);
        grid.add(Weight,2,0);
        grid.add(cabbage,0,1);
        grid.add(cabbageAmount,1,1);
        grid.add(cabbageWeight,2,1);
        grid.add(cake,0,2);
        grid.add(cakeAmount,1,2);
        grid.add(cucumber,0,3);
        grid.add(cucumberAmount,1,3);
        grid.add(cucumberWeight,2,3);
        grid.add(sweetpotato,0,4);
        grid.add(sweetpotatoAmount,1,4);
        grid.add(sweetpotatoWeight,2,4);
        grid.add(total,0,5);
        grid.add(serial,0,6);
        grid.add(Word,0,7);
        grid.add(name,0,8);
        grid.add(address,0,9);
        grid.add(phonenumber,0,10);//output

        primaryStage.setTitle("CreateOrder");
        primaryStage.show();
    }
}
