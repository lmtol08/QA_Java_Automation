package OOPConcepts;

public class onepageinheritance {
    public static void main(String[] args) {

        Veg veg = new Veg("1","2lb","cucumber");
        System.out.println(veg.size+" "+ veg.weight+" "+veg.name);
        veg.fresh();
        veg.pay();
    }
}

class Basket{
    public String size;
    public String weight;

    public Basket(String size,String weight){
        this.size = size;
        this.weight = weight;
    }
    public void pay(){
        System.out.println("pay for it");
    }
}

class Veg extends Basket{
    public String name;

    public Veg(String size,String weight,String name){
        super(size,weight);
        this.name= name;
    }
    public void fresh(){
        System.out.println("this veggie is fresh");
    }
}

