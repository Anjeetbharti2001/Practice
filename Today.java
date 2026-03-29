//power of number x^n
public class Today{
    static int power(int x, int n){
        if(n == 0){
            return 1; // base case
        }
        return x * power(x, n-1);
    }
    public static void main(String args[]){
        int x = 2;
        int n = 3;
        System.out.println(power(x,n));
    }
}