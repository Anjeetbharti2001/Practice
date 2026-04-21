import java.util.*;

public class Today{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        // push 
        s.push(10);
        s.push(20);
        s.push(30);

        // Peek
        System.out.println("Top element :-" + s.peek());

        // Pop
        System.out.println("Removed :-" + s.pop());

        System.out.println("Stack:-" + s);
    }
}