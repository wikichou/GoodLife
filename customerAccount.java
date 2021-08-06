package test;

public class customerAccount extends account{

    private String address = null;
    private Order myorder  = new Order();

    public customerAccount(String name, int password, int pn, String add){
        setname(name);
        setpassword(password);
        setphonenumber(pn);
        this.address = add;
    }//three set are from class account

    public customerAccount(){

    }
    
    public String getaddress(){

        return address;
    }

    public void setAddress(String add){

        this.address = add;
    }

    public void setMyorder(Order o){

        this.myorder = o;
    }

    public Order getMyorder(){
        return myorder;
    }
    
}