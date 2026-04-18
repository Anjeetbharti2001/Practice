import java.util.*;

public class Today{
  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();

    // Enqueue
    q.add(10);
    q.add(20);
    q.add(30);

    System.out.println("Queue :-" +  q);
    // Dequeue
    q.remove();
    System.out.println("After removing : " + q);

    // peek
    System.out.println("Front element :-" + q.peek());
  }
}