import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top :" + s.peek()); //30

        s.pop();
        System.out.println("after pop :" + s.peek()); // 20
    }
}