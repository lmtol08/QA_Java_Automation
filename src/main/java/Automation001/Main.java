package Automation001;

//COME FROM SHAPE AS INHERITACE
//hierarchical
public class Main {
    public static void main(String[] args) {
        // creating objects
        //INHERITS COLOR PROPERTY FROM SHAPE  REECTANGLE IS ITS OWN


        //WE ARE CREATING INSTANCES
        // NAMING PROPERTIES FROM CONSTRUCTORS
        // INHERITS CONSTRUCTOR PROPERTIES
        // COLOR COmES FROM PARENT SHAPE, RADIUS IS LOCAL TO SAID SHAPE


        Circle circle = new Circle( "Red",5 );
        Rectangle rectangle = new Rectangle("Blue", 4.0,6.0);

        System.out.println(circle);
        System.out.println("Area of circle" + circle.getArea());

        System.out.println(rectangle);
        System.out.println("Area of rectangle" + rectangle.getArea());
    }
}
