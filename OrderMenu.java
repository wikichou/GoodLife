package test;

public class OrderMenu implements MenuProto{
    Goods gd = Goods.getGoods("cak");
 public void display(){
     gd.getAll();

    }
} 