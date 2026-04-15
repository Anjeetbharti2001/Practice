// public class Today{
//     public static void main(String args[]){
//         int arr[] = {55,65,75,56,78,78,90};
//         int i;
//         modify(marks);

//         for(i = 0; i<= marks.length -1; i++);
//         System.out.println(marks[i] + " ");
//     }
//     static void modify(int[]m)
//     int i ;
//     for(i = 0; i<= m.length- 1; i++)
//         m[i] = m[i]*2;
// }

public class Today {
    public static void main(String args[]) {
        int arr[] = {55,65,75,56,78,78,90};

        modify(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void modify(int[] m) {
        for(int i = 0; i < m.length; i++) {
            m[i] = m[i] * 2;
        }
    }
}