// Peek Top element 
import java.util.*;

public class Today{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println("Top element : - " + stack.peek());
    }
}