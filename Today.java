class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking ");
    }
}

class Puppy extends Dog {
    void weep(){
        System.out.println("Puppy is Weeping");
    }
}

public class Today{
    public static void main(String args[]){
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}