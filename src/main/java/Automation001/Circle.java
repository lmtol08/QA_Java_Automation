package Automation001;

//child of Shapes --- inherits shape class thats why we havre
//Super color
// INHERITANCE -OOP CONCEPT
public class Circle extends Shape {
    public double radius;

    //constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius* radius;
        }
    @Override
     public String toString(){
        return "Circle [Color= " + color + ", radius= " + radius + "]";
    }
}
