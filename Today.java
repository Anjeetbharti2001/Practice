interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather(){
        System.out.println("Father's methods");
    }
    public void showMother(){
     System.out.println("Mother's Method");
    }
   
}

public class Today{
    public static void main(String args[]){
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}