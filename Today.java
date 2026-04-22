// Remove element in stack 
import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(12);
        s.push(90);

        System.out.println(s.pop()); // remove top
        System.out.println(s);
    }
}