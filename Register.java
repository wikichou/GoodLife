package test;
import java.util.Scanner;

public class Register{  

    private Scanner sc = new Scanner(System.in);
    private Database db = new Database();
    private int i = 0;

    public void create(){//create a new customer account
        String name = sc.next();
        int password = sc.nextInt();
        int pn = sc.nextInt();
        String add = sc.next();
        db.setCustomerAccount(new customerAccount(name, password, pn, add));
        //System.out.println(db.getCustomerAccount(i).getname());//test
        //i++;
        //sc.close();
    }
}