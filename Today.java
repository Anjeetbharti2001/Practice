import java.util.*;

public class Today{
    public static void main(String args[]){
        int arr[] = {4,5,2,10};
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!s.isEmpty() && s.peek() <arr[i]){
                System.out.println(s.pop() + " -> " + arr[i]);
            }
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            System.out.println(s.pop() + " -> -1");
        }
    }
}