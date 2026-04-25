import java.util.ArrayList;

public class Today{
    public static void main(String args[]){
        // Create a copys of the arrays list
        ArrayList<String> boys = new ArrayList<String>();
        boys.add("Anjeet");
        boys.add("bharti");
        boys.add("Hanu");
        boys.add("veer");
        boys.add("Chita");
        boys.add("sher");
        boys.add("Tiger");
        
        ArrayList boys2 = (ArrayList)boys.clone();
        boys2.set(0, "King");
        System.out.println(boys);
        System.out.println(boys2);
    }
}