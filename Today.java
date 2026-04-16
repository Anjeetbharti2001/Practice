import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);

        int sum = 0;
        for(int x : st){
            sum += x;
        }
        System.out.println("Sum :-" + sum);
    }
}