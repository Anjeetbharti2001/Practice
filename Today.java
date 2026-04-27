import java.util.*;
public class Today{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("queue:-" + q);
        System.out.println("remove" + q.poll());
        System.out.println("front:" + q.peek());
    }
}