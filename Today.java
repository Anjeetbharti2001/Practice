import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Character> s = new Stack<>();
         String str = "Anjeet";

        for(char c : str.toCharArray()){
            s.push(c);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}