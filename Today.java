import java.util.*;
public class Today{
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(3);

        if(q.isEmpty()){
            System.out.println("Queue is Empty:-");
        }else{
            System.out.println("Queue is not empty");
        }
    }
}