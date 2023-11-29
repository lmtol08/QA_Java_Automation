package OOPConcepts;
//Inheritance in Java
/*
inheritance in java is a concept in which one object acquires all the properties
and behaviors of the parent object.
The idea behind inheritance is that you cna create new classes that are built upon existing
classes. When you inherit from an existing class, you can reuse methods and variables/fields of the
parent class

Inheritance is an IS-A relationship
we can use inheritance for Method-overriding and code re-usability

Class
sub-class or child class
Super/parent class
Extends Keyword

Types of Inheritance:
1> single level (class A >> Class B) -A is parent B is child
2> multilevel (class A >> Class B >> class C) - A is parent - b is child - c is grand child
3> Hierarchical (Class A >> Class B && Class A >> Class C) A is parent and B and C are children of A

*/
//multilevel

public class Inheritance {
    public static void main(String[] args) {

        Car car = new Car("Toyota","Camry","black",2023,4);
        System.out.println(car.make+" " +car.model+" "+car.color+" "+ car.year+" "+ car.doors);
        car.start();
        car.honk();
        car.stop();

        System.out.println("-----========--------------");
        Truck truck = new Truck("Volvo","1000","white",2020,2,"diseal");
        System.out.println(truck.make+" " +truck.model+" "+truck.color+" "+ truck.year+" "+ truck.doors
                +" "+truck.type);
        truck.start();
        truck.honk();
        truck.haul();
        truck.stop();


    }
}