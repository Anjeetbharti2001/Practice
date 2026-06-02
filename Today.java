import java.util.*;
public class Today{
    public static void main(String args[]){
        int i, j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row value n ");
        n = sc.nextInt();
        for(i = 1; i<=n; i++){
            for(j = 1; j<= i; j++)
                System.out.println("" + j);
            System.out.println("\n");
        }
    }
}