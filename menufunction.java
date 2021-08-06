package test;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class menufunction{

    private ChangeMenu change = new ChangeMenu();
    private Scanner sc = new Scanner(System.in);
    //private int tmp = 1;
    private Register Reg = new Register();
    private LogIn LI = new LogIn();
    private CreateOrder create = new CreateOrder();
    private Database db = new Database();
    private showOrder so = new showOrder();
    private ShowCustomer sct = new ShowCustomer();
    private TrackOrder to  = new TrackOrder();
    int serial;
 

    public menufunction(){

    }

    public void startmenu(int tmp) {

        boolean x = true;
        do{
            change.setMenu(new WelcomeMenu());//first menu
            change.display();
            //tmp.set(sc.nextInt());
            x = true;
            System.out.println("");
            switch(tmp){//go to certain menu
                case 1:
                    x = false;
                    change.setMenu(new LogInMenu());
                    change.display();
                    if(LI.staffcheck(sc.next(),sc.nextInt())) {
                        System.out.println("Login Success\n");
                        change.setMenu(new StaffMenu());
                        change.display();
                        serial = sc.nextInt();
                        so.setOrder(db.getCustomerAccount(to.track(serial)).getMyorder());//look for user's order
                        change.setMenu(so);
                        change.display();
                        sct.setcustomer(db.getCustomerAccount(to.track(serial)));
                        change.setMenu(sct);
                        change.display();
                    }
                    else {
                        System.out.println("Login Fail\n");
                        break;
                    }
                    break;
                case 2:
                    int choice;

                        x = false;
                        change.setMenu(new LogInMenu());
                        change.display();
                        if (LI.check(sc.next(), sc.nextInt())) {
                            System.out.println("Login Success\n");
                        } else {
                            System.out.println("Login Fail\n");
                            break;
                        }
                        do {
                        change.setMenu(new CusterMenu());
                        change.display();
                        choice = sc.nextInt();
                        if (choice == 1) {//new order
                            //change.setMenu(new OrderMenu());
                            //change.display();
                            db.getCustomerAccount(LI.getNowpos()).setMyorder(create.create(sc));
                        } else if (choice == 2) {//check order
                            //change.setOrder(db.getCustomerAccount(LI.getNowpos()).getMyorder());
                            so.setOrder(db.getCustomerAccount(LI.getNowpos()).getMyorder());//look for user's order
                            change.setMenu(so);
                            change.display();
                            sct.setcustomer(db.getCustomerAccount(LI.getNowpos()));
                            change.setMenu(sct);
                            change.display();
                        } else if(choice == 3)
                            break;
                    }while(choice != 3);
                        break;
                case 3:
                x = false;
                    change.setMenu(new RegiCusMenu());
                    change.display();
                    Reg.create();
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    x = false;
                    System.out.println("The choice isn't exist!");
                    break;
            }
        }while(x == false);//if isn't exit ,restart
        sc.close();
    }//all menu
}