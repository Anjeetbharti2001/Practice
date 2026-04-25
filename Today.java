import java.util.ArrayList;

public class Today{
    public static void main(String args[]){
        // checks whether an item exist in the list
        ArrayList<String> boys = new ArrayList<String>();
        boys.add("Anjeet");
        boys.add("bharti");
        boys.add("Hanu");
        boys.add("veer");
        boys.add("Chita");
        boys.add("sher");
        boys.add("Tiger");
        boys.add("I am a problem solver");
        
        System.out.println(boys.contains("I am a problem solver"));

        System.out.println(boys.contains("I am best software engineer"));
    }
}