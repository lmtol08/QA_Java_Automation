package OOPConcepts;

public class ENCAPSULATION {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);

        // Access the object's data through getter methods
        System.out.println("Name: " + person1.getName());

        // Use a setter method to modify the age
        person1.setAge(35);

        // Call a method to introduce the person
        person1.introduce();
    }
}

class Person {
    // Private instance variables (attributes)
    private String name;
    private int age;

    // Public constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use a setter method to set the age
    }

    // Getter method to access the name
    public String getName() {
        return name;
    }

    // Setter method to set the age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // Public method to introduce the person
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}