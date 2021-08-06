package test;

public class Database{

    static private customerAccount[] CAccount = new customerAccount[100000];
    static private Order[] order = new Order[100000];
    static private int customerTmp = 0;
    static private int staffTmp = 0;
    static private staffAccount sa = new staffAccount("abc",123);

    public void setCustomerAccount(customerAccount a){
        CAccount[customerTmp] = a;
        customerTmp++;
    }

    public void setOrder(Order a){
        order[customerTmp] = a;
        staffTmp++;
    }

    public customerAccount getCustomerAccount(int x){
        return CAccount[x];
    }


    public static int getCustomerTmp() {
        return customerTmp;
    }

    public boolean checkExist(int i){
	if(CAccount[i] == null)
		return false;
	return true;
}
}