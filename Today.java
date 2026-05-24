class Person{
    String name = " Anjeet Bharti ";
}
class Student extends Person{
    int marks = 90;
}
public class Today{
    public static void main(String args[]){
        Student s = new Student();

        System.out.println("Name : " + s.name);
        System.out.println("Marks" + s.marks);
    }
}