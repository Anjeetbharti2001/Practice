// Find Kth Smallest Element 

import java.util.*;

public class Today{
    public static void main(String args[]){
        int arr[] = {7,10,4,3,20,15};

        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr){
            pq.add(num);
        }

        for(int i = 0; i< k; i++){
            pq.poll();
        }

        System.out.println(pq.peek());
    }
}