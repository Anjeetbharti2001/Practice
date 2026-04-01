public class Today{
    static int CountDigit(int n){
        if(n == 0){
            return 0;
        }
        return 1 + CountDigit(n/10);
    }
    public static void main(String args[]){
        int num = 1234;
        int result = CountDigit(num);
        System.out.println("number of digit =" + result);

    }
}