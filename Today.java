import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(6);
        st.push(7);

        int sum = 0;

        for(int x : st){
            sum += x;
        }
        System.out.println("sum of element in stack:- " + sum);
    }
}