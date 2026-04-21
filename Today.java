import java.util.*;

public class Today {
    public static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[')
                s.push(ch);
            else {
                if(s.isEmpty()) return false;
                char top = s.pop();
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '['))
                    return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str));
    }
}