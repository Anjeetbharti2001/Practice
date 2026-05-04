// Inser element and print them in  sorte order using heap.
import java.util.*;

public class Today{
    public static void main(String args[]){
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}