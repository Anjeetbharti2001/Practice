// Check if Heap is Empty

import java.util.*;

public class Today{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()){
            pq.poll();
        }

        if(pq.isEmpty()){
            pq.poll();
        }

        if(pq.isEmpty()){
            System.out.println("Heap is Empty");
        }else{
            System.out.println("Heap is not Empty");
        }
    }
}