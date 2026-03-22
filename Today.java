public class Today{
    static void printRev(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        printRev(n - 1);
    }
    public static void main(String args[]){
          printRev(5);
    }
}