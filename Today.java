import java.util.*;
public class Today{
  public static void main(String args[]){
    ArrayDeque<String> dequeueStack = new ArrayDeque<>();
    dequeueStack.push("A");
    dequeueStack.push("N");
    dequeueStack.push("H");

    System.out.println("Initial ArrayDequeue Stack :" + dequeueStack);
    System.out.println("Popped from Array Dequeue: " + dequeueStack.pop());
    System.out.println("Arrays Dequeue Stack After pop: " + dequeueStack);
  }
}