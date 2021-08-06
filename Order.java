package test;
import java.security.SecureRandom;
import java.util.Scanner;

public class Order{
    private int serial = 0;
    private int[] goods = new int[7];//for goods ，when customer add a new thing to his cart , certain number in array will increase
    private int total = 0;//total price
    private String cakeword;
    private SecureRandom random = new SecureRandom();


    public Order(){
    }

    public void setTotal(int a){
        this.total = a;
    }

    public String getOwner(String a){
        return cakeword;
    }

    public int getTotal(){
        return  total;
    }

    public int[] getAllChoice(){
        return goods;
    }

    public int getSerial(){
        return  serial;
    }

    public String getCakeword(){
        return  cakeword;
    }

    public void addToCart(int choice, int amount, int decrease, String a){
        int x = random.nextInt()%100;
        serial = x*x;
        if(decrease == 1) {
            switch (choice) {
                case 1:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("cabbage").getAmountValue() * amount;
                    break;
                case 2:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("cabbage").getweightValue() * amount;
                    break;
                case 3:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("cake").getAmountValue() * amount;
                    System.out.println("What do you want to write on cake?");
                    cakeword = a;
                    break;
                case 4:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("cucumber").getAmountValue() * amount;
                    break;
                case 5:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("cucumber").getweightValue() * amount;
                    break;
                case 6:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("sweetpotato").getAmountValue() * amount;
                    break;
                case 7:
                    goods[choice - 1]+=amount;
                    total = total + Goods.getGoods("sweetpotato").getweightValue() * amount;
                    break;
                default:
                    break;
            }
        }
        else if(decrease == 0) {
            switch (choice) {
                case 1:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("cabbage").getAmountValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 2:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("cabbage").getweightValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 3:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("cake").getAmountValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 4:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("cucumber").getAmountValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 5:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("cucumber").getweightValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 6:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("sweetpotato").getAmountValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                case 7:
                    if(goods[choice - 1]>amount) {
                        goods[choice - 1] -= amount;
                        total = total - Goods.getGoods("sweetpotato").getweightValue() * amount;
                    }
                    else
                        System.out.println("you haven't buy that much");
                    break;
                default:
                    break;
            }
        }
        //0 for cabbage amount ,1 for cabbage weight ,2 for cake amount ,3 for cucumber amount,4 for cucumber weight ,5 for sweetpotato amount,6 for sweetpotato weight
    }

}
