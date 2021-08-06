package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInFX {
    LogIn LI = new LogIn();
    Label label = new Label("name:");
    TextField account = new TextField();
    Label label2 = new Label("password:");
    TextField pass = new TextField();
    Button btn = new Button("Login");
    Text title = new Text("asd");
    Text text = new Text();
    Stage primaryStage = new Stage();

    public LogInFX() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(grid, 300, 275);
        text = new Text("");
        primaryStage.setScene(scene);


        //title.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
        //grid.add(title, 1, 0, 1, 1);

        HBox hbBtn = new HBox(btn);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(hbBtn, 1, 4);
        grid.add(label, 0, 1);
        grid.add(account, 1, 1);
        grid.add(label2, 0, 2);
        grid.add(pass, 1, 2);
        grid.add(btn, 1, 3);
        grid.add(text,1,4);
        //GUI element
        primaryStage.setTitle("login");
        primaryStage.show();

    }

}
