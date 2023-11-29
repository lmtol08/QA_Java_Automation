package Automation001;
// removed main method
//VARIABLE
//hierarchal
class Shape{
    //CONSTRUCTORR
    public String color;
    public Shape(String color){
        this.color = color;

    }
public double getArea(){
        return 0.0;
}
//BEHAVIOR
@Override
public String toString(){
    return "Shape [Color= " + color + "]";
}
}

