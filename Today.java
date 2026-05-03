import java.util.*;
public class Today{
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Anjeet");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        System.out.println(map);

        //Access value
        System.out.println(map.get(101));
    }
}