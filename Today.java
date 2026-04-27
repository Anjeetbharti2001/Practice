import java.util.*;
public class Today{
    public static void main(String args[]){
        // Write a program to find the size of a queue.
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(2);

        System.out.println("Size of Queue :- " + q.size());
    }
}