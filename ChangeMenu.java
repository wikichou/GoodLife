package test;

public class ChangeMenu{// set  dynamically
    private MenuProto mp = new WelcomeMenu();
    private Order od = new Order();//for show order

        public void setMenu(MenuProto mp){
            this.mp = mp;
        }

        public void display(){
            mp.display();
        }

}