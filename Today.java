// public class Today{
//     public static void main(String args[]){
//         int [] p;
//         p = func();
//         for(int i = 0; i<=p.length -1; i++){
//             System.out.println(p[i] + " ");
//         }
//         static int[]func()
//     }
//     int []arr= {10,20,30,40,50};
//     return arr;
// }


public class Today {
    public static void main(String args[]) {
        int[] p;
        p = func();

        for(int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
    }

    static int[] func() {
        int[] arr = {10, 20, 30, 40, 50};
        return arr;
    }
}
