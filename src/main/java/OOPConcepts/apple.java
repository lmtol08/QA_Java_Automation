package OOPConcepts;
// variable
class apple extends Fruit {

    //constructor
    String taste;

    apple(String color, int seedCount, String taste) {
        super(color, seedCount);
        this.taste = taste;
    }
// behaviors
    void display() {
        System.out.println("Fruit Color: " + color);
        System.out.println("Number of Seeds: " + seedCount);
        System.out.println("Taste: " + taste);
    }

    // Override bite behavior from the Fruit
    @Override
    void bite() {
        System.out.println("The apple is good.");
    }
}

