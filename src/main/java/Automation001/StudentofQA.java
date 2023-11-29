package Automation001;

public class StudentofQA {
    public static void main(String[] args) {
        Students Student1 = new Students(1,"James","Brown");
        Student1.Print();
        Students Student2 = new Students(2,"Lauren","Jackson");
        Student2.Print();
        Students Student3 = new Students(3,"Zuri","Smith");
        Student3.Print();
    }
}
class Students{
    int id;
    String FirstName;
    String LastName;

    // constructor

    public Students(int id,String FirstName,String LastName){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;

    }
    //behavior
    public void Print(){
        System.out.println(id +" "+ FirstName +" "+ LastName);
    }
}
