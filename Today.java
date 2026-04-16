import java.util.*;

public class Today {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        Stack<Integer> st2 = new Stack<>();
        for (int x : st) {
            st2.push(x);
        }
        System.out.println(st2);
    }
}