package test;

import java.util.Scanner;

public class CreateOrder {
    private int finish;
    private ChangeMenu change = new ChangeMenu();
    public CreateOrder(){

    }

    public Order create(Scanner sc) {
        Order nOrder = new Order();
        int choices = 0;
        do {
            System.out.println("put in or take out(1 for in,0 for out)");
            int add = sc.nextInt();//1 for put in.0 for take out
            System.out.printf("%-15s%-15s%-15s\n","Goods","AmountPrice","WeightPrice");
            change.setMenu(new OrderMenu());
            change.display();
            System.out.println("choose which one do you want to buy");
            int choice = sc.nextInt();//choose which to buy
            System.out.println("By 0.amount or 1.Weight?(cake only can by amount)");
            int pick = sc.nextInt();
            switch (choice){
                case 1:
                    if(pick == 0)
                        choices = 1;
                    else if(pick == 1)
                        choice = 2;
                    else {
                        System.out.println("error");
                        break;
                    }
                    break;
                case 2:
                    if(pick == 0)
                        choices = 3;
                    else{
                        System.out.println("error");
                        break;
                    }
                    break;
                case 3:
                    if(pick == 0)
                        choices = 4;
                    else if(pick == 1)
                        choice = 5;
                    else {
                        System.out.println("error");
                        break;
                    }
                    break;
                case 4:
                    if(pick == 0)
                        choices = 6;
                    else if(pick == 1)
                        choice = 7;
                    else {
                        System.out.println("error");
                        break;
                    }
                    break;
            }
            System.out.println("How many/much");
            int tmp = sc.nextInt();//number of amount or weight
            nOrder.addToCart(choices, tmp, add, "sc");
            System.out.println("press 0 to finish buying, 1 to continue");
                finish = sc.nextInt();
                if(finish == 0) {
                    if (nOrder.getTotal() < 400) {
                        System.out.println("Order's total must over than 400");
                        finish = 1;
                    } else if (nOrder.getTotal() < 1200) {
                        System.out.println("The total is :"+nOrder.getTotal()+",We will charge delivery for 200 NTD");
                        nOrder.setTotal(nOrder.getTotal()+200);
                    } else {
                        System.out.println("The delivery is free because the total is more than 1200");
                    }
                }
        } while (finish == 1);
        return nOrder;
    }
}
