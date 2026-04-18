import java.util.*;
public class Today{
  public static void main(String args[]){
    Stack<Integer> q = new Stack<>();

    if(q.isEmpty()){
      System.out.println("Queue is Empty");
    }
    q.add(5);
    q.add(10);

    if(!q.isEmpty()){
      System.out.println("Queue is not empty");
    }
  }
}