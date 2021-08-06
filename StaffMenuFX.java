package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class StaffMenuFX {

    Label Hint = new Label("Please input the serial of the order that you want to track");
    TextField Serial = new TextField();
    Button btn = new Button("check");
    private TrackOrder to  = new TrackOrder();
    private Database db = new Database();

    public StaffMenuFX(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(grid, 400, 200);
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);

        grid.add(Hint,0,1);
        grid.add(Serial,0,2);
        grid.add(btn,0,3);
        primaryStage.setTitle("StaffMenu");
        primaryStage.show();

        btn.setOnAction(event -> {
            int serial = Integer.valueOf(Serial.getText());
            ShowOrderFX SOF = new ShowOrderFX(db.getCustomerAccount(to.track(serial)).getMyorder(),db.getCustomerAccount(to.track(serial)));
            primaryStage.close();
        });
    }
}
