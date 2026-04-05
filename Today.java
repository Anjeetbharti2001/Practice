public class Today{
    static int countDigits(int n){
        //base condition
        if(n == 0){
            return 0;
        }
        // recursive call 
        return 1 + countDigits(n/10);
    }
    public static void main(String args[]){
        int num = 12345;
        int result = countDigits(num);
        System.out.println("number of digit = " + result);
    }
}