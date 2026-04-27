import java.util.*;
public class Today{
    //Write a program to insert 5 elements in a queue and print them

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter five Element");
        for(int i = 0; i< 5; i++){
            q.add(sc.nextInt());
        }
        System.out.println("Queue element");
        for(int x : q){
            System.out.print(x + " ");
        }

    }
}