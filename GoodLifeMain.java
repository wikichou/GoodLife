
package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.lang.*;


public class GoodLifeMain extends Application{
    public static void main(String[] args) {

        //menufunction MC = new menufunction();
        //MC.startmenu();
        //WelcomeMenuFX a = new WelcomeMenuFX();
        launch(args);
    }

   @Override
    public void start(Stage primaryStage) throws Exception {
       Stage stage = new Stage();
       stage.setTitle("GoodLifeFood");
       GridPane grid = new GridPane(); //use Grid
       grid.setAlignment(Pos.CENTER); //Layout center
       grid.setHgap(10); //horizon
       grid.setVgap(10);// vertical
       Label prompt = new Label("Welcome to goodLifeFoods, please choose your identity");
       Button ans1 = new Button("staff");
       Button ans2 = new Button("customer");
       Button ans3 = new Button("new customer? create a account");
       Button ans4 = new Button("Exit");

       grid.setPadding(new Insets(10, 10, 10, 10));

       Scene scene = new Scene(grid, 400, 300);

       //GUI element
       grid.add(prompt, 0, 0);
       grid.add(ans1, 0, 1);
       grid.add(ans2, 0, 2);
       grid.add(ans3, 0, 3);
       grid.add(ans4, 0, 5);

       ans1.setOnAction(event -> {
            LogInStaffFX LSF  = new LogInStaffFX();
       });

       ans2.setOnAction(event -> {
           LogInCusFX LF  = new LogInCusFX();
       });

       ans3.setOnAction(event -> {
           CreateMenuFX CMF = new CreateMenuFX();
       });

       ans4.setOnAction(event -> {
            ExitFX EF = new ExitFX();
           stage.close();
       });

       stage.setScene(scene);
       stage.setResizable(false);
       stage.show();
       //menufunction MC = new menufunction();
       //MC.startmenu(tmp.get());
    }
}