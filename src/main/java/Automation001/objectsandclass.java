package Automation001;
//What is an object?
//Any entity that has a state and behavior is known as an object.
//State — represents the data(value) of an object
//Behavior — represents the behavior(functionality) of an object.
//Identity - a unique ID implements an object identity. The value of the id
//           is not visible to the external user.


//what is a class ??
// A class is a group of objects which have common properties.
// it could be a blueprint from which objects are created.
// A class can contain - fields, Methods, constructors, blocks, nested class and interfaces.

// New - Key word.
//

public class objectsandclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Frita";
        System.out.println(s1.id + s1.name);

        Student s2 = new Student();
        s2.id = 2;
        s2.name= "Abdur";
        System.out.println(s2.id+ " "+ s2.name);

        Employee employee1 = new Employee(1,"Daniel","QA");
        employee1.Print();


    }
}

//  THIS BECOMES A BLUEPRINT FOR EMPLOYEES TO BE CREATED. YOU CSN CREATE AS MANY AS YOU WANT

    class Student{
        int id;
        String name;
    }

    class Employee{
        int id;
        String name;
        String Department;

        public Employee(int id, String name, String Department){
            this.id = id;
            this.name= name;
            this.Department= Department;
        }
        public void Print(){
            System.out.println(id+" "+name+" "+Department);
        }
    }




