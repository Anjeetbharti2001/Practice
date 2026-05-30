// Write a program for multilevel Inheritance 
class Animal{
    void eat(){
        System.out.println("Animal eat food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy weeps");
    }
}

public class Today{
    public static void main(String [] args){
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}