package OOPConcepts;
// single
public class Tree {
    public static void main(String[] args) {
        // Creating an instance for  redApple class
        apple redApple = new apple("Pink", 60, "Tart");

        // Behavior from both parent(Fruit) and child (apple)
        redApple.display();
        redApple.bite();
    }
}


