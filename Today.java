public class Today{
    static int CountDigits(int n){
        if(n == 0){
            return 0;
        }
        //recursive call
        return 1 + CountDigits(n/10);
    }
    public static void main(String args[]){
          int num = 12345;
          int result = CountDigits(num);
          System.out.println("number of digit = " + result);
    }
}