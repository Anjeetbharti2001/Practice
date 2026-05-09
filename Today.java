import java.util.*;

public class Today{
    public static void  main(String args[]){
        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
        list.add("Anjeet");
        list.add("Mohan");

        for(String name : list){
            System.out.println(name);
        }

    }
}