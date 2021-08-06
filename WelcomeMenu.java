package test;

public class WelcomeMenu implements MenuProto{
    public void display(){
        System.out.println("Welcome to goodLifeFoods, please choose your identity");
        System.out.println("1.staff");
        System.out.println("2.customer");
        System.out.println("3.new customer? create a account");
        System.out.println("4.Exit");

    }
}