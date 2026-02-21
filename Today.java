// public class Today{
//     public static void main(String args[]){
//         int arr[] = {3,6,8,0, 3,7,1};
        
//         for(int i = 0; i<arr.length -1 ; i++){
//             for(int j=0; i<arr.length-1-i; i++){
//                 if(arr[j] > arr[j + 1]){
//                     // Swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         // Print sorted array
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class Today {
    public static void main(String args[]) {
        int arr[] = {3, 6, 8, 0, 3, 7, 1};
        
        // Bubble sort implementation
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Sorted array print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}