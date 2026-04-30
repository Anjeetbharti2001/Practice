import java.util.*;
public class Today{
    // how to check element in hashset?
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        System.out.println(set.contains(10));//True
    }
}