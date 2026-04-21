import java.util.*;
public class Today{
    public static void main(String args[]){
        String str = "Anjeet";
        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray())
            s.push(ch);

        String rev = "";
        while(!s.isEmpty())
            rev += s.pop();

        System.out.println("Reversed : " + rev);
    }
}