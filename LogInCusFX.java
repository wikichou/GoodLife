package test;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInCusFX extends LogInFX{//create by LogInFx


    public LogInCusFX() {
        btn.setOnAction(e -> {
            if (LI.check(account.getText(), Integer.valueOf(pass.getText()))) {
                text.setText("Login Success");
                CusterMenuFX CMF = new CusterMenuFX();
                primaryStage.close();
            }
            else
                text.setText("Login fail");
        });
    }
}
