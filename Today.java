class Father{
    void house(){
        System.out.println("Fther has a house");
    }
}

class Son extends Father{
    void bike(){
        System.out.println("Son has a bike ");
    }
}

public class Today{
    public static void main(String args[]){
        Son s = new Son();

        s.house();
        s.bike();
    }
}