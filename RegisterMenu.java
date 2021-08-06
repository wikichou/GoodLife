package test;

public class RegisterMenu implements MenuProto{

    public void display() {
        System.out.println("what kind of account do you want to create?");
        System.out.println("1.customer account");
        System.out.println("2.staff account");
    }
}