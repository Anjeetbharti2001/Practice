import java.util.*;
public class Today{
    public static void main(String args[]){
        HashMap<Integer, String>map = new HashMap<>();

        map.put(1, "Ram");
        map.put(2,"Shyam");
        map.put(3,"Mohan");
        map.put(4,"Ram");

        System.out.println(map);

        //Access
        System.out.println(map.get(3));//mohan
        System.out.println(map);
    }
}