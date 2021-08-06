package test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TableFX {

    protected TableView<Goods> table = new TableView<>();
    protected TableView<Goods> table2 = new TableView<>();
    protected ObservableList<Goods> data = FXCollections.observableArrayList();
    protected ObservableList<Goods> data2 = FXCollections.observableArrayList();
    String first = "Goods";
    GridPane grid = new GridPane();
    VBox vbox = new VBox();
    VBox vbox2 = new VBox();
    Scene scene = new Scene(grid, 530, 600);
    Stage primaryStage = new Stage();
    Text title = new Text("");


    public TableFX() {

        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        TableColumn goods = new TableColumn(first);
        TableColumn amountprice = new TableColumn("Aprice");
        TableColumn weightprice = new TableColumn("WPrice");
        TableColumn amount = new TableColumn("amount");
        TableColumn weight = new TableColumn("Weight");
        table.setEditable(true);
        table2.setEditable(true);


        table.getColumns().addAll(goods, amountprice, weightprice);
        ObservableList<Goods> List = FXCollections.observableArrayList();
        goods.setCellValueFactory(new PropertyValueFactory<Goods,String>("goods"));
        amountprice.setCellValueFactory(new PropertyValueFactory<Goods,String>("Amount"));
        weightprice.setCellValueFactory(new PropertyValueFactory<Goods,String>("Weight"));
        for(Goods gd : Goods.values()){
            data.add(gd);
        }
        table.setItems(data);
        table.getColumns().addAll(goods, amountprice, weightprice);


        table2.getColumns().addAll(goods, amount, weight);



        primaryStage.setScene(scene);

        StackPane p = new StackPane();
        p.getChildren().add(title);
        StackPane.setAlignment(title, Pos.TOP_CENTER);
        vbox.setPadding(new Insets(-20, 10, 10, 10));
        vbox.getChildren().add(table);

        vbox2.setPadding(new Insets(-20, 10, 10, 10));
        vbox2.getChildren().add(table2);


        grid.add(p, 0, 0);
        grid.add(vbox, 0, 1);
        grid.add(vbox2,1,1);

        primaryStage.setTitle("table");
        primaryStage.show();

    }
}