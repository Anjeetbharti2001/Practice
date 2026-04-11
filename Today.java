import java.util.*;
public class Today{
    public static void main(String args[]){
        String str = "Anjeet";
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            st.push(ch);
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}