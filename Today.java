//pop element from stack
import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        System.out.println(stack);
    }
}