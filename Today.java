class Student {
    private int marks;
    public void setMarks(int m){
        marks = m ;
    }
    public int getMarks(){
        return marks;
    }
}

public class Today{
    public static void main(String [] args){
        Student s = new Student();

        s.setMarks(90);
        System.out.println("Marks : " + s.getMarks());
    }
}