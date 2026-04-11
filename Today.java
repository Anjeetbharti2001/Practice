import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        for(int i : st){
            System.out.println(i);
        }
    }
}