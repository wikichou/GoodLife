package test;

public class StaffMenu implements MenuProto{
    @Override
    public void display() {
        System.out.println("Which order do you want to check?");
    }
}