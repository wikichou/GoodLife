package test;

public class LogIn{

    Database db = new Database();
    private String now ;
    private static int nowpos;

    public boolean check(String name, int password){
        for(int i = 0; i<=10000;i++){
	   if(db.checkExist(i)){
            if(name.equals(db.getCustomerAccount(i).getname())){
                if(db.getCustomerAccount(i).getpassword() == password)
                    now =  db.getCustomerAccount(i).getname();
                    nowpos = i;
                    return true;
            }
        }
}
        //System.out.println(db.getCustomerAccount(0).getname());
        return false;
    }

    public boolean staffcheck(String name, int password){
        if(name.equals("abc"))
            if(password == 123)
                return true;
            return false;
    }

    public String getnow(){
        return now;
    }

    public int getNowpos(){
        return nowpos;
    }
}