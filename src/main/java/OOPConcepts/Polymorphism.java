package OOPConcepts;
import java.sql.SQLOutput;

/*
Polymorphism is one of the fundamental concepts of the OOP
*it allows objects of different classes to be treated as objects of common super class
*polymorphism enables you to write more flexible and reusable code by abstracting away
*the specific implementation details of objects and focusing on their common behaviors
*
*in polymorphism 2 mechanisms
* 1> Method Overloading
* 2> Method Overriding
*
* 1> Method Overloading
* -- method overloading occurs when a subclass provides specific implementation for a method
* that is already defined in its super class.
*
* the overriding method in the subclass should have the same method signature.
*the @Override annotation is often used to indicate that a method is intended to override
* a super class method.
* when we call a method on an object, java will execute the appropriate implementation
* of that method based on that actual type of the object at runtime.
*
* Interface
* in Java interfaces define a contract for class to implement. Multiple classes can implement the
* same interface and each class provides its own implementation for the methods declared in the interface.
* we can use polymorphism by creating objects of classes that implements the same interface and treating them
* as instances of interface.
*this allows us to work with objects in a generic way without worrying about this specific implementation.
* */
public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("-------Creating Animal class instance with Cat object's makeSound.");
        Animal myAnimal = new Cat();
        myAnimal.makeSound();

        System.out.println("---------");
        Animal animal = new Animal();
        animal.makeSound();

    }
}

class Animal{
    void makeSound(){
        System.out.println("Is that the sound a cat makes?");
    }
}

class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}