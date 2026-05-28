class Car{
    String color;

    void drive(){
        System.out.println("Car is Driving ");
    }
}
public class Today{
    public static void main(String args[]){
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.drive();
    }
}