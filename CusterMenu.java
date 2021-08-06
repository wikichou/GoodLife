package test;

public class CusterMenu implements MenuProto{
    @Override
    public void display() {
        System.out.println("What do you want to do?");
        System.out.println("1.New order");
        System.out.println("2.Check my order");
        System.out.println("3.Log out");
    }
}