//check stack is empty
import java.util.*;
public class Today{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
    }
}