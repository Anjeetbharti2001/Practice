// public class Learn{
//     public static void main(String args[]){
//         int arr[] = {2,7,8,2,1,5,4};
//         int sum = 0;
//         for(int i = 0; i<arr.length; i++){
//             sum += arr[i];
//         }
//         System.out.println(sum);
//     }
// }

// sorted  array accending ORDER
// import java.util.*;
// public class Learn{
//     public static void main(String args[]){
//         int arr[] = {4,7,8,2,5,1,3};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Search an Element in Array(linear search)

// import java.util.*;
// public class Learn{
//     public static void main(String args[]){
//         int arr[] = {10,25,30,45,50};
//         int key = 30; // element to search
//         boolean found = false;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] == key){
//                 System.out.println("Element Found at index:" + i);
//                 found = true;
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("Element not found");
//         }
//     }
// }

// Count odd number in array

// public class Learn{
//     public static void main(String args[]){
//         int arr[] = {4,2,6,8,2,1};
//         int count = 0;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] % 2 != 0){ // odd check 
//                 count++;
//             }
//         }
//         System.out.println("Total odd number " + count);
//     }
// }

// Find the minimum element in array
public class Learn{
    public static void main(String args[]){
        int arr[] = {2,6,8,4,6,3,7,2};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("minimum element in array :-" + min);
    }
}