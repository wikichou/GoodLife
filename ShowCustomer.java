package test;

public class ShowCustomer implements MenuProto{
    private customerAccount ca = new customerAccount();

    public void setcustomer(customerAccount c){
        this.ca = c;
    }

    @Override
    public void display() {
        System.out.println("name :" + ca.getname());
        System.out.println("address :" + ca.getaddress());
        System.out.println("phonenumber :" + ca.getphonenumber());
    }
}
