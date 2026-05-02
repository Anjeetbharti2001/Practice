import java.util.*;
public class Today{
    public static void main(String args[]){
       List<Integer> List = Arrays.asList(2,4,6,8,10);
       int key = 6;
       // Linear Search 
       System.out.println("Linear Search : -" + List.contains(key));
       // Binary Search using the collections.BinarySearch
       //(list must be sorted)
       int index = Collections.binarySearch(List,key);
       if(index >= 0){
        System.out.println("Element Found at index " + index);
       }else{
        System.out.println("Element not Found");
       }
    }
}