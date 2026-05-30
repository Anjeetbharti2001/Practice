// Write a program to demonstrate Single Inheritance.
class Animal{
    void eat(){
        System.out.println("Animals is eating ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking ");
    }
}
public class Today{
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}