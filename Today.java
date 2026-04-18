import java.util.*;
public class Today{
  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 5 elements:-");
    for(int i = 0; i< 5 ; i++){
      q.add(sc.nextInt());
    }

    System.out.println("Queue elements:");
    for(int x : q){
      System.out.println(x + " ");
    }
  }
}