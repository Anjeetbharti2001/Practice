import java.util.*;
public class Today{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size:-");
        int n = sc.nextInt();

        
        int arr[] = new int[n];

        int sum = 0; 
        System.out.println("enter element:-");
        for(int i = 0; i< n ; i++){
            System.out.println(".()");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum/n;
        System.out.println("average element:-" + avg);

    }
}