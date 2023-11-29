package OOPConcepts;

/// variable

public class Fruit {

    //constructor
    String color;
    int seedCount;

    Fruit(String color, int seedCount) {
        this.color = color;
        this.seedCount = seedCount;
    }
// behavior
    void bite() {
        System.out.println("This fruit is awesome!!");
    }
}
