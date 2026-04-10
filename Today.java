import java.util.*;
public class Today{
    public static void main(String args[]){
        // reverse a string using stack 
        String str = "hello";
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            st.push(ch);
        }

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}