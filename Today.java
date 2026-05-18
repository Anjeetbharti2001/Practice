// Find product of Two Number using Recursion
public class Today{
    static int product(int a, int b){
        if(b == 0)
            return 0;

        return a + product(a, b -1);
    }
    public static void main(String args[]){
        System.out.println(product(4,3));
    }
}