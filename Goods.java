package test;

public enum Goods{// all Goods
    cab("cabbage",50,40),
    cak("cake",300,0),
    cuc("cucumber",20,100),
    swe("sweetpotato",35,120);
    
    private Goods(String name,int amountvalue, int weightvalue){
        this.name = name;
        this.amountvalue = amountvalue;
        this.weightvalue = weightvalue;
    }
    
    private String name;
    final private int amountvalue;
    final private int weightvalue;
    
    public String getName(){

        return name;
    }
    public int getAmountValue(){

        return amountvalue;
    }
    
    public int getweightValue(){

        return weightvalue;
    }
    
    
    public static Goods getGoods(String name){
    for(Goods gd : values()){
      if(gd.getName().equals(name)) {
        return gd;
      }
    }
    return null;
  }
 
    public static void getAll(){
        int i = 0;
        for(Goods gd : values()){
            if(i == 1)
                System.out.printf(i+1+".%-15s%-15d\n",gd.getName(),gd.getAmountValue());
            else
                System.out.printf(i+1+".%-15s%-15d%-15d\n",gd.getName(),gd.getAmountValue(),gd.getweightValue());
            i++;
        }
    }
}