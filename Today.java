class Add{
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a + b + c;
    }
}
public class Today{
    public static void main(String args[]){
        Add a = new Add();

        System.out.println(a.sum(2,3));
        System.out.println(a.sum(2,3,4));
    }
}