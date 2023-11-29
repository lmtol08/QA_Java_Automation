package OOPConcepts;
//;if a class can haveany entity reference its a known aggreation

// Displays HAS a relationship

// student class represents indiv students and has name studentID attributes.
/*
the uni class reps a uni which as many students
it has a name attribute and a list of students aznd num of students vfariable to keep track of the

numberodstudents

the add student method in uni class allows you to add studdents to the university
it checks if thereis a soace in the limit given before adding the student,

the aggregation class / main method demonstrates how to create  uni
add students and retriefve and print the list

this is a aggregation as Uni HAS-A reltionship with
multiple tudent jobs
the uni class containsx a list of sudent object as its part.class


you can make univ and students anyway  an make shanges.class you vant with inheritance.


THEY HAVE A RELATIONSHIP.. NOT A DEPENDENCVY(INHERIANCE

set it up likee inheritance with seperate pages connecting to main
 */

public class Aggregation {
    public static void main(String[] args) {
        Student student1 = new Student("James", 1001);
        Student student2 = new Student("Lauren",1002);
        Student student3 = new Student("Zuri",1003);

        University myUniversity = new University("QA University",3);
        myUniversity.addStudent(student1);
        myUniversity.addStudent(student2);
        myUniversity.addStudent(student3);

        //print all the university students
        Student[] universityStudents = myUniversity.getStudents();
        System.out.println("University: " + myUniversity.getName());
        System.out.println("Students: ");
        for (Student student : universityStudents){
            if (student != null){
                System.out.println("Name: " + student.getName() +" " + "ID: " + student.getStudentID());
            }
        }
    }
}

class Student{
    private String name;
    private int studentID;

    public Student(String name,int studentID){
        this.name = name;
        this.studentID = studentID;
    }

    public String getName(){
        return name;
    }
    public int getStudentID(){
        return studentID;
    }

}

class University{
    private String name;
    private int numberOfStudents;
    private Student[] students;

    public University(String name, int maxStudents){
        this.name= name;
        students = new Student[maxStudents];
        numberOfStudents = 0;
    }
    public void addStudent(Student student){
        if (numberOfStudents < students.length){
            students[numberOfStudents] = student;
            numberOfStudents++;
        }else {
            System.out.println("University is Full");
        }
    }
    public Student[] getStudents(){
        return students;
    }
    public String getName(){
        return name;
    }
}