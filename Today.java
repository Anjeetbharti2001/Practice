// public class Today{
//     // print number 1 to n 
//     static void printNum(int n){
//         if(n == 0){
//             return;
//         }
//         printNum(n - 1);
//         System.out.println(n);
//     }
//     public static void main(String args[]){
//           printNum(9);
//     }
// }

public class Today{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial (n -1);
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}