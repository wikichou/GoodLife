package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;




public class CusterMenuFX {

    Button btn = new Button("Create Order");
    Button btn2 = new Button("Check My order");
    Button btn3 = new Button("Log out");
    private Database db = new Database();
    private LogIn LI = new LogIn();

    public CusterMenuFX(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(grid, 200, 250);
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);

        grid.add(btn,0,1);
        grid.add(btn2,0,2);
        grid.add(btn3,0,3);
        primaryStage.setTitle("CusterMenu");
        primaryStage.show();

        btn.setOnAction(event -> {
            CreateOrderFX COF = new CreateOrderFX();
        });

        btn2.setOnAction(event -> {
            ShowOrderFX SOF = new ShowOrderFX(db.getCustomerAccount(LI.getNowpos()).getMyorder(),db.getCustomerAccount(LI.getNowpos()));
        });

        btn3.setOnAction(event -> {
            primaryStage.close();
        });
    }
}
