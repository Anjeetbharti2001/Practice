import java.util.*;
public class Today{
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Anjeet");
        map.put(2, "Rahul");
        map.put(3, "Aman");

        for(Integer key : map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }
    }
}