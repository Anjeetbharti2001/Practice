import java.util.*;
public class Thursday{
    public static void main(String args[]){
        // Search an element in Array
        int arr[] = {4,5,2,6,8};
        int key = 2;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println(" Element found at index :-" + i);
                found = true;
                break;
            }
        }
        if (!found ){

            System.out.println("Element is not found:-");
        }
    }
}