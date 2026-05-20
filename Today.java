// Find Largest Digit in Number 
public class Today{
    static int largest(int n){
        if(n < 10)
            return n;

        return Math.max(n % 10, largest(n / 10));
    }
    public static void main(String args[]){
        System.out.println(largest(5382));
    }
}