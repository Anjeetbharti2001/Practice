import java.util.Stack;

public class Today{
    public static boolean isValid(String s){
       Stack<Character>st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

   

       
    public static void main(String args[]){
        System.out.println(isValid("()()"));
    }
}