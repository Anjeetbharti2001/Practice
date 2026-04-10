import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(3);

        int max = Integer.MIN_VALUE;

        while(!st.isEmpty()){
            int val = st.pop();
            if(val > max ) max = val;
        }
        System.out.println("Max : " + max);
    }
}