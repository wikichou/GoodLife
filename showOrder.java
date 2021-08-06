package test;

public class showOrder implements MenuProto{
    Order tmp = new Order();
    int merch[] ;

    public void setOrder(Order a){
        this.tmp = a;
        merch = tmp.getAllChoice();
    }
    @Override
    public void display() {
        System.out.printf("%-15s%-10s%-10s\n"," ","amount","weight");
        System.out.printf("%-15s%-10d%-10d\n","cabbage",merch[0],merch[1]);
        System.out.printf("%-15s%-10d\n","cake",merch[2]);
        System.out.printf("%-15s%-10d%-10d\n","cucumber",merch[3],merch[4]);
        System.out.printf("%-15s%-10d%-10d\n","sweetpotato",merch[5],merch[6]);
        System.out.println("The total is :" + tmp.getTotal());
        System.out.println("The serial is :"+ tmp.getSerial());
        System.out.println("Word on cake :" + tmp.getCakeword());
    }
}
