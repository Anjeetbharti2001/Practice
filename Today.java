import java.util.*;
public class Today{
  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();

    Stack<Integer> stack = new Stack<>();

    q.add(1);
    q.add(2);
    q.add(3);

    // Moves queue to stack 
    while(!q.isEmpty()){
      stack.push(q.remove());
    }

    // Move back to queue
    while(!stack.isEmpty()){
      q.add(stack.pop());
    }
    System.out.println("Reversed queue : " + q);
  }
}