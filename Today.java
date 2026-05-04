// Merge two Element Using Heap

import java.util.*;
public class Today{
    public static void main(String args[]){
        int arr[] = {1,4,7};
        int arr1[] = {2,3,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr) pq.add(num);
        for(int num : arr1) pq.add(num);

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}