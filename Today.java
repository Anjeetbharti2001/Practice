import java.util.*;
public class Today{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> Stack = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        
        //move queue to stack 

        while (!q. isEmpty()){
            Stack.push(q.remove());
        }
        //moves back to queue
        while(!Stack.isEmpty()){
            q.add(Stack.pop());
        }
        System.out.println("Removes :-" + q);
    }
}