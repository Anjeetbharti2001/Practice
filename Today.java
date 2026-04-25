import java.util.*;
public class Today{

    public static void main(String args[]){
        // add a collection of items to the list
       ArrayList<String> boys = new ArrayList<String>();
       boys.add("Anjeet");
       boys.add("Bharti");
       boys.add("Hanu");
       boys.add("Veer");
       boys.add("chita");

       ArrayList<String> brands = new ArrayList<String>();
       brands.add("Microsoft");
       brands.add("Apple");
       brands.add("Amazone");

       brands.addAll(boys);

       System.out.println(brands);
    }
}