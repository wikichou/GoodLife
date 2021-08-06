package test;

public class account{
    private String name = null;
    private int password = 0;
    private int phonenumber = 0;

    //order myorder = new order();

    public void setname(String name){

        this.name = name;
    }

    public void setpassword(int password){

        this.password = password;
    }

    public void setphonenumber(int pn){

        this.phonenumber = pn;
    }
    public String getname(){

        return name;
    }

    public int getpassword(){

        return password;
    }

    public int getphonenumber(){

        return phonenumber;
    }
}