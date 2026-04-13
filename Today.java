import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);

        while(!st.isEmpty()){
            st.pop();
        }
        System.out.println("The empty: " + !st.isEmpty());
    }
}