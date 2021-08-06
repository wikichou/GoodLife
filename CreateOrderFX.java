package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateOrderFX{

    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 400, 300);
    Stage primaryStage = new Stage();
    VBox vbox = new VBox();
    Label Goods = new Label("Goods");
    Label AmountPrice = new Label("AmountPrice");
    Label Weightprice = new Label("Weightprice");
    Label cabbage = new Label("cabbage");
    Label cabbageAprice = new Label("50");
    Label cabbageWprice = new Label("40");
    Label cake = new Label("cake");
    Label cakeprice = new Label("300");
    Label cucumber = new Label("cucumber");
    Label cucumberAprice = new Label("20");
    Label cucumberWprice = new Label("100");
    Label sweetpotato = new Label("sweetpotato");
    Label sweetpotatoAprice = new Label("35");
    Label sweetpotatoWprice = new Label("120");//menu
    Button btn1 = new Button("cabbage");
    Button btn2 = new Button("cake");
    Button btn3 = new Button("cucumber");
    Button btn4 = new Button("sweetpotato");
    Button btn5 = new Button("finish");//choice
    private Order nOrder = new Order();
    private LogIn LI = new LogIn();
    private Database db = new Database();

    public CreateOrderFX(){

        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        primaryStage.setScene(scene);
        grid.add(Goods,0,0);
        grid.add(AmountPrice,1,0);
        grid.add(Weightprice,2,0);
        grid.add(cabbage,0,1);
        grid.add(cabbageAprice,1,1);
        grid.add(cabbageWprice,2,1);
        grid.add(cake,0,2);
        grid.add(cakeprice,1,2);
        grid.add(cucumber,0,3);
        grid.add(cucumberAprice,1,3);
        grid.add(cucumberWprice,2,3);
        grid.add(sweetpotato,0,4);
        grid.add(sweetpotatoAprice,1,4);
        grid.add(sweetpotatoWprice,2,4);
        grid.add(btn1,0,5);
        grid.add(btn2,1,5);
        grid.add(btn3,0,6);
        grid.add(btn4,1,6);
        grid.add(btn5,2,6);

        btn1.setOnAction(event -> {
            IOChoiceFX IOF = new IOChoiceFX();
            IOF.getChoice(nOrder);
            IOF.setChoice(0);
        });
        btn2.setOnAction(event -> {
            IOChoiceFX IOF = new IOChoiceFX();
            IOF.getChoice(nOrder);
            IOF.setChoice(2);
        });
        btn3.setOnAction(event -> {
            IOChoiceFX IOF = new IOChoiceFX();
            IOF.getChoice(nOrder);
            IOF.setChoice(3);
        });
        btn4.setOnAction(event -> {
            IOChoiceFX IOF = new IOChoiceFX();
            IOF.getChoice(nOrder);
            IOF.setChoice(5);
        });
        btn5.setOnAction(event -> {
            if (nOrder.getTotal() < 400) {
                NotEnoughFX NEF = new NotEnoughFX();
            }
            else if (nOrder.getTotal() < 1200) {
                DeliveryFX DF = new DeliveryFX();
                nOrder.setTotal(nOrder.getTotal()+200);
                db.getCustomerAccount(LI.getNowpos()).setMyorder(nOrder);
                primaryStage.close();
            }
            else {
                FreeDeFX FDF = new FreeDeFX();
                System.out.println(nOrder.getTotal());
                db.getCustomerAccount(LI.getNowpos()).setMyorder(nOrder);
                primaryStage.close();
            }
        });

        primaryStage.setTitle("CreateOrder");
        primaryStage.show();
    }
}
