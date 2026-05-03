import java.util.*;

public class Today{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate 

        System.out.println(set);
    }
}