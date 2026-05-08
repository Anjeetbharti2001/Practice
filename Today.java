import java.util.*;
public class Today{
    public static void main(String args[]){

        int v = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i< v ; i++){
            graph.add(new ArrayList<>());
        }

        // Edge add
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        System.out.println(graph);
    }
}