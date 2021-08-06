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

public class LogInStaffFX extends LogInFX{//create by LogInFx

    public LogInStaffFX(){

        btn.setOnAction(e -> {
            if (LI.staffcheck(account.getText(), Integer.valueOf(pass.getText()))) {
                text.setText("Login Success");
                StaffMenuFX stm = new StaffMenuFX();
            }
            else
                text.setText("Login fail");
        });
    }
}
