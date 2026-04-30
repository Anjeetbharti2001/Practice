import java.util.*;
public class Today{
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();

        set.add("Anjeet");
        set.add("Sarjun");
        set.add("Anjeet"); // Dplicate innore

        System.out.println(set);
    }
}