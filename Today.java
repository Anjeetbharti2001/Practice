import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);

        Stack<Integer> st2 = new Stack<>();
        for(int x : st1){
            st2.push(x);
        }
        System.out.println(st2);
    }
}