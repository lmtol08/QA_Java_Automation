package Automation001;

//main method

//EXTENDS = CLASS YOU WANT TO INHERIT FROM
public class Rectangle extends Shape {
    public double width;
    public double height;

public Rectangle(String color,double width, double height){
    // SUPER COMING FROM PARENT
    super(color);
    this.width=width;
    this.height=height;
}

public double getArea(){
    return width*height;
}

@Override
public String toString(){
    return "Rectangle [Color= " + color + "'width" + width + "+,height" + height + "]";
}


}
