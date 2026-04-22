//Reversed a string using stack 
import java.util.*;
public class Today {
    public static void main(String args[]){
        String str = "hello";
        Stack<Character> s = new Stack<>();

        for(char ch: str.toCharArray()){
            s.push(ch);
        }
        while(!str.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
