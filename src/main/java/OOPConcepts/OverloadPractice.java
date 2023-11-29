package OOPConcepts;

public class OverloadPractice {
// CREATING 1 OBJECT  2 MEETHODS
    public static void main(String[] args) {
        FlowerBed myFlowerBed = new FlowerBed();

        int result1 = myFlowerBed.add(8,9);
        System.out.println(result1);

        double result2 = myFlowerBed.add(1.36,5.74);
        System.out.println(result2);

    }
}


class FlowerBed{
    int add (int a,int b){
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
}
