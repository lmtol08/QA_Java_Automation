package OOPConcepts;

public class InterfaceinJava {
    public static void main(String[] args) {
        Bird sparrow = new Bird("sparrow");

        sparrow.fly();
        sparrow.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}

class Bird implements Flyable,Swimable{
    private String name;

    public Bird(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }

    @Override
    public void swim(){
        System.out.println(name + " is swimming");
    }
}