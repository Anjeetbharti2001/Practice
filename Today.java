import java.util.*;

public class Today{
    // Write a java program to reversed a queue

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        Stack <Integer> Stack = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);

        //move to stack

        while(!q.isEmpty()){
            Stack.push(q.remove());
        }

        //move back to queue
        while(!Stack.isEmpty()){
            q.add(Stack.pop());
        }
        System.out.println("Reversed:-" + q);

    }
}